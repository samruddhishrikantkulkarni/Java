//implementation of CompareTo method
import java.io.*;

class StringDemo {
    static int myCompareTo(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    continue;
                } else {
                    int diff = arr1[i] - arr2[i];
                    return diff;
                }
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    continue;
                } else {
                    int diff = arr1[i] - arr2[i];
                    return diff;
                }
            }
        }
        
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first string");
        String str1 = br.readLine();
        System.out.println("Enter second string");
        String str2 = br.readLine();
        int compareResult = myCompareTo(str1, str2);
        System.out.println(compareResult);
    }
}

