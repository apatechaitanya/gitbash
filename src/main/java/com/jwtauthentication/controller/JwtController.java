package com.jwtauthentication.controller;

import com.jwtauthentication.jwthelper.JwtUtil;
import com.jwtauthentication.model.JwtRequest;
import com.jwtauthentication.model.JwtResponse;
import com.jwtauthentication.service.CustomUserDetailsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private CustomUserDetailsService customeUserDetailService;

    @Autowired
    private JwtUtil jwtUtil;
    @RequestMapping(value = "/token",method = RequestMethod.POST)
    public ResponseEntity<?>generatToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        log.info(" {}",jwtRequest.toString());
        try{
            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
        }catch (UsernameNotFoundException e){
            e.printStackTrace();
            throw new Exception("Bad credentials");
        }
        UserDetails userDetails =  this.customeUserDetailService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtil.generateToken(userDetails);
        log.info("JWT Token {}",token);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    @RequestMapping(value = "/welcome",method = RequestMethod.POST)
    public String welcome(){
        return "Welcome";
    }
}
