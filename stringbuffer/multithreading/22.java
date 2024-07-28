//ThreadGroup
class MyThread implements Runnable{
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
		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();
                Thread t1=new Thread(pThreadGP,"Maharashtra");
                Thread t2=new Thread(pThreadGP,"Goa");
                 t1.start();
                 t2.start();
                 ThreadGroup cThreadGP=new ThreadGroup(pThreadGP,"Pakistan");
		 MyThread obj3=new MyThread();
		 MyThread obj4=new MyThread();
                 Thread t3=new Thread(pThreadGP,"Lahore");
                 Thread t4=new Thread(pThreadGP,"Korachi");
		   t3.start();
		   t4.start();
        }
}
