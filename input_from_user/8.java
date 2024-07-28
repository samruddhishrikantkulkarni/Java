//input using bufferedreader
import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter society name, wing, flat no: ");
        String info = br.readLine();
        System.out.println(info);
    }
}

