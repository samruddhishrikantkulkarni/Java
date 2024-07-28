//variables in interface
interface Demo{
	int x=10;
      c  void fun();
}
class DemoChild implements Demo{
        public void fun(){
                System.out.println(x);
		System.out.println(Demo.x);
        }
}
class Client{
        public static void main(String[] args){
                Demo obj=new DemoChild();
                obj.fun();
        }
}
