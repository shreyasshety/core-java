class LaboratoryRunner{
public static void main(String [] values){
	String name= "names";
	String location = "1st floor";
	String [] operatorName = {"sonu","sreekanth","shre"};
	int noOfRooms = 2;
	LabType type = LabType.CS;
Laboratory ref = new Laboratory(name,location,noOfRooms,operatorName,type);
System.out.println(ref.name);
System.out.println(ref.location);
System.out.println(ref.operatorName[0]);
System.out.println(ref.noOfRooms);
System.out.println(ref.type);




}
}