// istatic in nterface
interface Demo1 {
    static void m1() {
        System.out.println("Demo m1");
    }
}

interface Demo2 {
    static void m2() {
        System.out.println("Demo m2");
    }
}

class Client {
    public static void main(String[] args) {
        Demo1.m1();
        Demo2.m2();
    }
}

