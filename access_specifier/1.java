//Real time example
class C2W{
	int noOfCourse=10;
	String favlec="Java";
	void disp(){
		System.out.println("No. of course: "+noOfCourse);
		System.out.println("Fav lec: "+favlec);
	}
}
class Student{
	public static void main(String[] arrgs){
		C2W obj=new C2W();
		obj.disp();
	}
}
