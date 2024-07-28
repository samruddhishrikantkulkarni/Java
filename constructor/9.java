//Real time example
class C2W{
	int noOfCourse=10;
	String favLec="Control statement";
	void disp(){
		System.out.println("No. of course: "+noOfCourse);
		System.out.println("Fav lec: "+favLec);
	}
}
class Student{
	public static void main(String[] args){
		C2W obj=new C2W();
		obj.disp();
	}
}
