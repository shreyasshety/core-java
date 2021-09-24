class country{
	public static String getCountrybyPin(int pin)
	{
		if (pin==91){
			System.out.println("india");
			return ("india");
		}
		if (pin==1){
			System.out.println("canada");
			return ("canada");
		}

		if (pin==92){
			System.out.println("Pak");
					return ("12");
		}
	return ("");
	}
public static void main(String [] values)
{	int no = 1;
	getCountrybyPin(no);
} 
}