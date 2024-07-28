//implementation of LastIndexOf method
import java.io.*;

class StringDemo {
    static int myStrLastIndexOf(String str, char ch, int index) {
        char[] arr = str.toCharArray();
        int y = -1;
        for (int i = 0; i < index; i++) {
            if (arr[i] == ch) {
                y = i;
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
        br.readLine(); 
        System.out.println("Enter index to start search up to that index: ");
        int index = Integer.parseInt(br.readLine());
        int result = myStrLastIndexOf(str, ch, index);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at last index = " + result);
        }
    }
}

