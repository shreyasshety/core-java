class Shirt{
public static String color="RED";
public static void ChangeColor(){
color="BLUE";
}
public static void PrintColor(){
System.out.println(color);
}
public static void main(String [] args){
	//ChangeColor();
	String shirtColor=color;
	System.out.println(shirtColor);
	
	ChangeColor();
	shirtColor=color;
	System.out.println(shirtColor);
	PrintColor();
}}
	