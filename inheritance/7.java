//real time example
class Microsoft{
	Microsoft(){
		System.out.println("Microsoft company");
	}
	void info(){
		System.out.println("Product based company");
	}
}
class Word extends Microsoft{
	Word(){
		System.out.println("Microsoft Word");
	}
}
class Client{
	public static void main(String[] args){
		Word obj=new Word();
		obj.info();
	}
}
