class Example4
	{
		static String Shrey(String Name,String favBike,String Company)
		{
			return Company;
		}
		
static void CompanyNames()
 {
	 String Company []={"TechMahindra","wipro","dell","hp","capegemini","beml","bel"};
		{
			System.out.println("------------------");
			for(int i=0;i<=Company.length-1;i++)
				{
					System.out.println(Company[i]);
				
				}
				System.out.println("------------------");
		}
 }
 
 static void MobileBrand()
	{
	 String Brand []={"mi","samsung","iphone","vivo","oppo"};
		System.out.println(Brand[0]);
		System.out.println("------------------");
	}

static void IPL()
	{
	 
	 String IPL[]={"ROYALCHALLENGERSBANGALORE","MI","DC","KKR","CSK"};
	 String lastteam = IPL[IPL.length-1];
	 System.out.println(lastteam);
	}
		 
public static void main(String [] args)
	{
		System.out.println(Shrey("ShreyasShetty","tvs","infosys"));
		CompanyNames();
		MobileBrand();
		IPL();
	}
}