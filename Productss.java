class Productss{
	static void Products(String ProductName, float Quantity, String Address)
	{
		System.out.println("Product wheat Details are:");
				System.out.println(ProductName);
				System.out.println( Quantity);

				System.out.println(Address);


		
	}
	public static void main(String [] args){
		Products("wheat", 2, "indiranagar");
	}
}