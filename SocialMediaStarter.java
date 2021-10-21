class SocialMediaStarter{
	
	public static void main(String [] values)
	{
		SocialMedia ref= new SocialMedia();
		
		ref.setName("instagram");
		System.out.println(ref.name);
	
		ref.setPlatform("desktop");
		System.out.println(ref.platform);
	
		ref.setVersion("v321");
		System.out.println(ref.version);
		
		ref.setSize(32);
		System.out.println(ref.size);
		
		ref.setLang("python");
		System.out.println(ref.lang);
	
	Companies ref1=new Companies();
	ref1.setFounder("mark zukerberg");
	SocialMedia.setCompanies(companies);
	//ref1.setName("facebook");
	//SocialMedia.setCompanies(ref1);
		System.out.println(SocialMedia.companies.founder);
	
	
	
	}
	
	
	
	
	
}