// Initialization of this
class Demo{
	int x=10;
	Demo(){
		System.out.println("In constructor");
		System.out.println(this);
		System.out.println(this.x);
	}
	void fun(){
		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String[] args){
		Demo obj1=new Demo();
		obj1.fun();
	}
}
