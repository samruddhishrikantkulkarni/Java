//inner class
class Outer{
	int x=10;
	static int y=20;
	class Inner{
		int a=30;
		final static int b=40;
	}
	public static void main(String[] args){
		Outer obj=new Outer();
		System.out.println(Outer.y);
		Outer.Inner obj1=obj.new Inner();
		System.out.println(Inner.b);
	}
}
