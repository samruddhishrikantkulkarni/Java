//implementation of IndexOf method
import java.io.*;

class StringDemo {
    static int myStrIndexOf(String str, char ch, int index) {
        char[] arr = str.toCharArray();
        int y = -1;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] == ch) {
                y = i;
                break;
            }
        }
        return y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string: ");
        String str = br.readLine();
        System.out.println("Enter character to find: ");
        char ch = (char) br.read();
        br.skip(1);
        System.out.println("Enter index to start search: ");
        int index = Integer.parseInt(br.readLine());
        int result = myStrIndexOf(str, ch, index);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index = " + result);
        }
    }
}

