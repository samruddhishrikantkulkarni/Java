//IOException
import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Start of main");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);

        System.out.println("End of main");
    }
}

