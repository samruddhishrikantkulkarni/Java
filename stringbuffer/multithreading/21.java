//ThreadGroup
class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg, str);
	}
public void run(){
	System.out.println(Thread.currentThread());
	try{
		Thread.sleep(5000);
	}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		ThreadGroup pThreadGP=new ThreadGroup("India");
		MyThread t1=new MyThread(pThreadGP,"Maharashtra");
		 MyThread t2=new MyThread(pThreadGP,"Goa");
		 t1.start();
		 t2.start();
		 ThreadGroup cThreadGP=new ThreadGroup(pThreadGP,"Pakistan");
		  MyThread t3=new MyThread(pThreadGP,"Lahore");
		   MyThread t4=new MyThread(pThreadGP,"Korachi");
		   t3.start();
		   t4.start();
		   ThreadGroup cThreadGP2=new ThreadGroup(pThreadGP,"Bangladesh");
		    MyThread t5=new MyThread(pThreadGP,"Dhaka");
		     MyThread t6=new MyThread(pThreadGP,"Manipur");
		     t5.start();
		     t6.start();
		     System.out.println(pThreadGP.activeCount());
		     System.out.println(pThreadGP.activeGroupCount());

	}
}
