//Initialization of access specifier
class Demo{
	int x=10;
	private int y=20;
	static int z=30;
	void display(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Client{
	public static void main(String[] args){
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		obj1.display();
		obj1.x=100;
		obj2.x=300;
		obj1.display();
		obj2.display();
	}
}
