// Initialization of constructor
class Demo{
	int x=10;
	Demo(){
		System.out.println("In constructor");
	}
	void fun(){
		System.out.println(x);
	}
	public static void main(String[] args){
		Demo obj1=new Demo();
		obj1.fun();
	}
}
