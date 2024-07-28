//implementation of boolean EqualsignoreCase method
import java.io.*;
class StringDemo {
    static boolean myStrEquals(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int flag = 0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i] || arr1[i] == arr2[i] + 32 || arr1[i] + 32 == arr2[i]) {
                    flag = 0;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first string: ");
        String str1 = br.readLine();
        System.out.println("Enter second string: ");
        String str2 = br.readLine();
        boolean val = myStrEquals(str1, str2);
        System.out.println(val);
    }
}

