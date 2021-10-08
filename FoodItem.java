class FoodItem{
	
	String name;
	float price;
	String hotelname;
	int quantity;
	Type type;
	int rating;
	float total;
	OrderType ordertype;
	static float TotalFoodItemPrice;
	void DisplayDeatils()
	{
		System.out.println("Food Item Name :"+ this.name);
		System.out.println("Food Item price :" +this.price);
		System.out.println("Food Item HotelName :"+this.hotelname);
		System.out.println("Food Item quantity :"+this.quantity);
		System.out.println(this.type);
		System.out.println("Food Item RATING :"+this.rating);
		System.out.println(this.ordertype);


		}
		
	void PrintToatalPrice()
	{
		
		total=this.price*this.quantity;
		System.out.println("total price is:" + total);
		
		
	}
	void  FoodItemPrice()
	{
		TotalFoodItemPrice = TotalFoodItemPrice + this.total;
		System.out.println("Total Food Item Price is:"+ TotalFoodItemPrice);
	}
	void HotelName()
	{
		System.out.println(this.hotelname);
	}
	void NameandPrice()
	{
		System.out.println(this.name);
		System.out.println(this.price);
		
	}
	
	
}