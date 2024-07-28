// multilevel inheriatnce
class Electronics{
        Electronics(){
                System.out.println("In Electronics Constructor");
        }
}
class Mobile extends Electronics{
        Mobile(){
                System.out.println("In Mobile Constructor");
        }
}
class Samsung extends Mobile{
	Samsung(){
		System.out.println("In Samsung Constructor");
	}
}
class Client{
        public static void main(String[] args){
                Samsung obj=new Samsung();
        }
}
