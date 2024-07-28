//static in inheritance
class Parent{
	int x=10;
        static int y=20;
        static{
                System.out.println("In parent static block");
        }
	Parent(){
		System.out.println("In parent consturctor");
	}
	void methodOne(){
		System.out.println(x);
	}
	static void methodTwo(){
		System.out.println(y);
	}
}
class Child extends Parent{
        static{
                System.out.println("In Child static block");
        }
	Child(){
		System.out.println("In child constructor");
	}
}
class Client{
        public static void main(String[] args){
                Child obj=new Child();
		obj.methodOne();
		obj.methodTwo();
        }
}
