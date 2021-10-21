class Shrey{
int age;
float salary;
char gender;

Shrey()

{ this(25,2777f,'f'); 
	System.out.println("default invoked");
	System.out.println("parameters");
}
Shrey(int age, float salary,char gender)
{
	//this();
		System.out.println(age);
			System.out.println(salary);
				System.out.println(gender);
System.out.println("parameters 5555");


}
Shrey(int ages,float salarys){
	
	System.out.println(ages);
			System.out.println(salarys);
				//System.out.println(genders);

}
}