//creating thread using threadclass
class MyThread extends Thread{
        public void run(){
		System.out.println("Childthread: "+Thread.currentThread().getName());
                for(int i=0;i<10;i++){
                        System.out.println("In run");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException obj){
			
			}
                }
        }
}
class ThreadDemo{
        public static void main(String[] args)throws InterruptedException{
		System.out.println("Mainthread: "+Thread.currentThread().getName());
                MyThread obj=new MyThread();
                obj.start();
                for(int i=0;i<10;i++){
                        System.out.println("In main");
			 Thread.sleep(1000);
                }
        }
}
