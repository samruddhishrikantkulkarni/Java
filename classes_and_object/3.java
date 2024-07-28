class Demo{
	int x=10;
	static int y=20;
	void fun(){
		int z=30;
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun();
		System.out.println(obj.x);
		System.out.println(y);
	}
}
