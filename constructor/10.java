//method signature
class Demo{
	int x=10;
	Demo(){
		System.out.println("In no args constructor");
	}
	Demo(int x){
		System.out.println("In para constructor");
	}
	public static void main(String[] args){
		Demo obj=new Demo();	
	}
}
