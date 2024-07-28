//Thread group
class MyThread extends Thread {
    MyThread(ThreadGroup tg, String str) { 
        super(tg, str); 
    }

    public void run() {
        System.out.println(Thread.currentThread());
    }
}

class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup pThreadGP = new ThreadGroup("Core2Web");
        MyThread obj1 = new MyThread(pThreadGP, "CPP");
        MyThread obj2 = new MyThread(pThreadGP, "Java"); 
        MyThread obj3 = new MyThread(pThreadGP, "Python"); 
        obj1.start();
        obj2.start();
        obj3.start();
    }
}

