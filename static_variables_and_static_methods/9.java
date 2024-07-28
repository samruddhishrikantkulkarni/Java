// Initialization of static block
class Demo{
	static{
		System.out.println("Static block 1");
	}
	public static void main(String[] args){
		System.out.println("In main 1");
	}
}
class Client{
	static{
		System.out.println("Static block 2");
	}
	public static void main(String[] args){
		System.out.println("In main 2");
	}
	static{
		System.out.println("Static block 3");
	}
}
