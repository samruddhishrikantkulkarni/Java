// Initialization of static method
class StaticDemo {
    int x = 10;
    static int y = 20;

    void fun1() {
        System.out.println(x);
        System.out.println(y);
    }

    static void fun2() {
        System.out.println(y);
    }
}

class Client {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        obj1.fun1();
        obj1.fun2();
        System.out.println(obj1.x);
        System.out.println(obj1.y);

    }
}

