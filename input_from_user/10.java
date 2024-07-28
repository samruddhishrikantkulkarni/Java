//stringtokenizer using scanner
import java.util.*;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player info:");
        String st = sc.nextLine();
        StringTokenizer str = new StringTokenizer(st, " ");
        String token1 = str.nextToken();
        String token2 = str.nextToken();
        String token3 = str.nextToken();
        String name = token1;
        int jerNo = Integer.parseInt(token2);
        float avg = Float.parseFloat(token3);
        System.out.println(name);
        System.out.println(jerNo);
        System.out.println(avg);
    }
}

