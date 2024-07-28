//try,catch block for arithmetic exception
class Demo{
        public static void main(String[] args){
                System.out.println("Start main");
                try{
                        System.out.println(10/0);
                }catch(ArithmeticException obj){
                        System.out.println(10/1);
                }
                System.out.println("End main");
        }
}
