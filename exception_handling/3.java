//arithmatic exception
class Demo{
	void m1(){
		System.out.println("In m1");
	}
	void m2(){
	System.out.println("In m2");
	System.out.println(10/0);
	}
}
class Client{
	public static void main(String[] args){
		System.out.println("Start main");
		Demo obj=new Demo();
		obj.m1();
		obj.m2();
		System.out.println("End main");
	}
}
