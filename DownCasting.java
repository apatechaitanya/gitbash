class PD
{
	
}
class CD extends PD
{
	
}
class XD {}
class YD extends XD{}
class ZD extends YD{}
class DownCasting
{
	public static void main()
	{
		// Upcasting
		PD p = new CD();
		// downcasting
		CD c = (CD) p;
		
		XD x = new ZD();
		YD y = (YD)x;
		ZD z = (ZD)x;
	}
}