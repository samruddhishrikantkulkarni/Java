//Real time example
abstract class Apple{
        void product(){
                System.out.println("Mobile");
        }
        abstract void mobile();
}
class IPhone extends Apple{
        void mobile(){
                System.out.println("IPhone 13");
        }
}
class Client{
        public static void main(String[] args){
                Apple obj=new IPhone();
                obj.product();
                obj.mobile();
        }
}
