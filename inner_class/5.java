//static inner class
class Outer{
	void m1(){
		System.out.println("In m1 outer");
	}
	static class Inner{
		void m1(){
			System.out.println("In m1 inner");
		}
	}
	public static void main(String[] args){
		Inner obj=new Inner();
		obj.m1();
		Outer obj1=new Outer();
		obj1.m1();
	}
}
