//real time example
class Player{
	int jerNo=18;
	String name="Virat Kolhi";
Player(){
	System.out.println("In constructor");
}
void info(){
	System.out.println(jerNo+"="+name);
}
}
class Client{
	public static void main(String[] args){
		Player obj1=new Player();
		obj1.info();
		 Player obj2=new Player();
		 obj2.jerNo=7;
		 obj2.name="MSD";
		 obj2.info();
		  Player obj3=new Player();
                 obj3.jerNo=45;
                 obj3.name="Rohit";
		 obj3.info();
	}
}
