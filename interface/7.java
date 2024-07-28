//default in interface
interface Demo1{
        default void fun(){
                System.out.println("In fun Demo1");
        }
}
interface Demo2{
        default void fun(){
                System.out.println("In fun Demo2");
	}
}
class DemoChild implements Demo{
        public void fun(){
                System.out.println("In fun DemoChild");
        }
}
class Client{
        public static void main(String[] args){
                Demo obj=new DemoChild();
                obj.fun();
		  Demo obj1=new DemoChild();
                obj1.fun();
		  Demo obj2=new DemoChild();
                obj2.fun();
        }
}
