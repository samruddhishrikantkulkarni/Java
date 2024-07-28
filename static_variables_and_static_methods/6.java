// Initialization of static block
class Demo{
	static{
		System.out.println("Static block 1");
	}
	public static void main(String[] args){
		System.out.println("Main method");
	}
	static{
		System.out.println("Static block 2");
	}
}
