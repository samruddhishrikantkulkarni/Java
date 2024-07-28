//implementation of CompareToIgnoreCase method
import java.io.*;

class StringDemo {
    static int myStrCompareToIgnoreCase(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int flag = 0;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i] || arr1[i] == arr2[i] + 32 || arr1[i] + 32 == arr2[i]) {
                    flag = 0;
                } else {
                    flag = 1;
                    break;  // Exit the loop early if a non-matching character is found
                }
            }
        } else {
            flag = 2;
        }

        if (flag == 0) {
            return 0;
        } else if (flag == 1) {
            return 1;
        } else {
            return arr1.length - arr2.length;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first string:");
        String str1 = br.readLine();
        System.out.println("Enter second string:");
        String str2 = br.readLine();
        int compareResult = myStrCompareToIgnoreCase(str1, str2);
        if (compareResult == 0) {
            System.out.println("Strings are equal");
        } else if (compareResult == 1) {
            System.out.println("Strings are not equal");
        } else {
            System.out.println("CompareResult = " + compareResult);
        }
    }
}

