class Example4{
 static String Shrey(String nName,String favBike,String Company){
	 System.out.println(Company);
	 return favBike;
 }
 static void CompanyNames(){
	 String Company []={"infosy","wipro","dell","hp","capegemini","beml","bel"};
	 System.out.println(Company);
 }
 public static void main(String [] args){
	 Shrey("ShreyasShetty","tvs","infosys");
	 CompanyNames();
 }
}