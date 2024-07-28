//passing values to a function
class Demo{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10);
	}
	void fun(float x){
		System.out.println("In fun");
		System.out.println(x);
	}
}
