//interface
interface Demo1 {
    void gun();
}

interface Demo2 {
    void fun();
}

class DemoChild implements Demo1, Demo2 {
    public void gun() {
        System.out.println("In gun");
    }

    public void fun() {
        System.out.println("In fun");
    }
}
class Client {
    public static void main(String[] args) {
        Demo1 obj1 = new DemoChild();
        obj1.gun();

        Demo2 obj2 = new DemoChild();
        obj2.fun();
    }
}

