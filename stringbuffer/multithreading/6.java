//thread name
class Demo extends Thread{
	public void run(){
		System.out.println("Demo: "+Thread.currentThread().getName());
	}
}
class MyThread extends Thread{
	public static void main(String[] args){
		System.out.println("MyThread: "+Thread.currentThread().getName());
		 Demo obj=new Demo();
		obj.start();
	}
}
class ThreadDemo{
	public static void main(String[] args){
		System.out.println("Thread: "+Thread.currentThread().getName());
		MyThread obj=new MyThread();
		obj.start();
	}
}
