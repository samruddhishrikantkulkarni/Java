//inheriatnce
class Parent{
        int x=10;
        Parent(){
                System.out.println("In Parent Constructor");
        }
	void access(){
		System.out.println("Parent insatance");

	}
}
class Child extends Parent{
        int y=20;
        Child(){
                System.out.println("In Child Constructor");
                 System.out.println(x);
                  System.out.println(y);
		  access();
        }
}
class Client{
        public static void main(String[] args){
                Child obj=new Child();
        }
}
