//normal inner class
class Outer{
	class Inner{
		void m1(){
			System.out.println("In m1 inner");
		}
	}
	void m2(){
		System.out.println("In m2 outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m2();
		Outer.Inner obj1=obj.new Inner();
		obj1.m1();
	}
}
