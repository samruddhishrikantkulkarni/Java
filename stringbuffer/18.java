//implementation of charAt
import java.io.*;

class StringDemo {
    static char myStringCharAt(String str, int x) {
        char arr[] = str.toCharArray();
        return arr[x];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string:");
        String str = br.readLine();
        System.out.println("Enter index to search character:");
        int index = Integer.parseInt(br.readLine());
        char ch = myStringCharAt(str, index);
        System.out.println("Character at given index is: " + ch);
    }
}

