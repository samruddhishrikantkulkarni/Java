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
		Outer.Inner obj=new Outer.Inner();
		obj.m1();
	}
}
