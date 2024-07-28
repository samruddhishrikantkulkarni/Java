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
        ThreadGroup pThreadGP = new ThreadGroup("In Cpp");
        MyThread obj4 = new MyThread(pThreadGP, "Flutter");
        MyThread obj5 = new MyThread(pThreadGP, "Reality");
        MyThread obj6 = new MyThread(pThreadGP, "Spring");
        obj4.start();
        obj5.start();
        obj6.start();
    }
}
