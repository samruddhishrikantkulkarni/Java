//priority of thread
class MyThread extends Thread{

}
class ThreadDemo{
        public static void main(String[] args){
                        Thread t=Thread.currentThread();
                        System.out.println(t.getPriority());
        }
}
