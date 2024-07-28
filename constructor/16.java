//implementation of this reference
class Demo{
        int x=10;
        Demo(){
		this(10);
                System.out.println("In no args constructor");
        }
        Demo(int x){
		super();
                System.out.println("In para constructor");
        }
        public static void main(String[] args){
                Demo obj=new Demo();
        }
}
