class FoodItemRunner{
	public static void main (String[] values)
	{
		FoodItem ref = new FoodItem();
		ref.name="dosa";
		ref.price=60;
		ref.hotelname="sagar";
		ref.quantity=2;
		ref.rating=4;
		ref.type=Type.SOUTH_INDIAN;
		ref.ordertype=OrderType.ONLINE;
		ref.DisplayDeatils();
		ref.PrintToatalPrice();
		ref.FoodItemPrice();
		
		FoodItem ref1 = new FoodItem();
		ref1.name="kabab";
		ref1.price=100;
		ref1.hotelname="al-bek";
		ref1.quantity=4;
		ref1.rating=5;
		ref1.type=Type.CHINESE;
		ref1.ordertype=OrderType.ONLINE;
		ref1.DisplayDeatils();
		ref1.PrintToatalPrice();
		ref1.FoodItemPrice();
		
		System.out.println("printing  HOTELNAME");
		FoodItem ref2 = new FoodItem();
		ref.HotelName();
		ref1.HotelName();
		
		System.out.println("printing  NAME AND PRICE");
		FoodItem ref3 = new FoodItem();
		ref.NameandPrice();
		ref1.NameandPrice();
		
	}
}