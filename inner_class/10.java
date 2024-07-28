//anoymous inner class
class Demo{
	int x=10;
	void marry(){
		System.out.println("Kirti Sanon");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo(){
		void marry(){
			System.out.println("Disha Patni");
		}
		};
	obj.marry();
}
}
