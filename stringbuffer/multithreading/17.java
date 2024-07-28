//thread group
class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}

class ThreadGroupDemo {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();
        System.out.println(obj.getName());
    }
}

