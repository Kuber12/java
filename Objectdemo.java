public class ObjectDemo{
	public static void main(String args[]){
		Student s0 = new Student();   	//default constructer     object instanse
		s0.roll = 1; 		//object initialization   instance initialization
		s0.age = 20;
		s0.name = "Anil";
		s0.address = "Biratnagar";

		DOB d0 = new DOB();
		d0.dd = 12;
		d0.mm = 2;
		d0.yy = 2020;

		s0.dob = d0;
		System.out.println("Name: " + s0.name);
		System.out.println("Address: " + s0.address);
		System.out.println("Roll no:: " + s0.roll);
		System.out.println("Age: " + s0.age);
		System.out.println("Date of Birth " + s0.dob.mm+ "/" + s0.dob.dd+"/"+ s0.dob.yy);
	}
}