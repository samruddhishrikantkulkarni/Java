//method local inner class
class Outer{
	void m1(){
		System.out.println("In m1 outer");
		class Inner{
			void InnerM1(){
				System.out.println("In m1 inner");
			}
		}
		Inner obj=new Inner();
		obj.InnerM1();
	}
	void m2(){
		System.out.println("In m2 outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m1();
		obj.m2();
	}
}
