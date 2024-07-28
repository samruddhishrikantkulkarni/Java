//ArrayList
import java.util.*;

class ArrayListDemo extends ArrayList{
    public static void main(String[] args) {
        ArrayListDemo al = new ArrayListDemo();
        al.add(10);
        al.add(20.5f);
        al.add("Shashi");
        al.add(10);
        al.add(20.5f);
        al.removeRange(3,5);
        System.out.println(al);
    }
}
