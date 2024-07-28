//throw keyword
import java.util.Scanner;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                try{
                        int x=sc.nextInt();
                        if(x==0){
                                throw new ArithmeticException("Divide by zero");
                        }
                        System.out.println(10/x);
                }catch(ArithmeticException ae){
                        System.out.println(ae.getMessage());
                }
        }
}
