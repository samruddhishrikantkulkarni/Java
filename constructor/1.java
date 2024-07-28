//Initialization of constructor
class ConstrDemo{
	ConstrDemo(){
		System.out.println("In constructor");
	}
	int x=10;
	public static void main(String[] args){
		System.out.println("In main");
		ConstrDemo obj=new ConstrDemo();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	int y=10;
}
