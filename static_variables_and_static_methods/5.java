// Initialization of static block
class Demo{
	static int x=10;
	static{
		System.out.println("Static block");
		System.out.println(x);
	}
	public static void main(String[] args){
		System.out.println("Main method");
	}
}
