//interface
interface Demo{
	void gun();
	void fun();
}
class DemoChild implements Demo{
	public void gun(){
		System.out.println("in gun");
	}
	public void fun(){
		System.out.println("In fun");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new DemoChild();
		obj.fun();
		obj.gun();
	}
}
