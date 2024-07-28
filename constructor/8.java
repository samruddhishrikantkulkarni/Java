//Initialzation of constructor
class McD{
	int item=5;
	String order="Fries";
	void fun(){
		String str1="Veg";
		String str2="Non veg";
		System.out.println(item);
		System.out.println(order);
	}
}
class Client{
	public static void main(String[] args){
		McD obj1=new McD();
		McD obj2=new McD();
		obj1.fun();
	}
}
