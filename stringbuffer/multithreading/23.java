//Thread pool
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {
    int num;

    MyThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(Thread.currentThread() + " Start Thread: " + num);
        displayTask();
        System.out.println(Thread.currentThread() + " End Thread: " + num);
    }

    void displayTask() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException ie) {
           
        }
   }
}
   class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService ser = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 6; i++) {
            MyThread obj = new MyThread(i);
            ser.execute(obj);
        }
        ser.shutdown();
    }
}

