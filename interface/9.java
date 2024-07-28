//static in interface
interface Demo1{
        static void fun1(){
                System.out.println("In fun Demo");
        }
}
interface Demo2{
        static void fun2(){
                System.out.println("In fun Demo");
        }
}
class DemoChild implements Demo{
        public void fun(){
                System.out.println("In gun DemoChild");
        }
}
class Client{
        public static void main(String[] args){
                DemoChild obj=new DemoChild();
                obj.fun();
        }
}

