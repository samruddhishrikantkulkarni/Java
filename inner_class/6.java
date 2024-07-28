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
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m1();
		Outer.Inner obj1=new Outer.Inner();
		obj1.m1();
	}
}
