//sleep() method
class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread());
	try{
		Thread.sleep(1000);
	}catch(InterruptedException ie){
		
	}catch(Exception obj){
	
	}
    }
}

class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        MyThread obj = new MyThread();
        obj.start();
        Thread.sleep(2000);
        Thread.currentThread().setName("Core2Web");
        System.out.println(Thread.currentThread());
    }
}

