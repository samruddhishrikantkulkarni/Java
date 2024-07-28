//input using bufferedreader and implement string tokenizer
import java.io.*;
class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter society name, wing, flat no: ");
        String info = br.readLine();
        System.out.println(info);
	StringTokenizer obj=new StringTokenizer(info," ");
	String token1=obj.nextToken();
	String token2=obj.nextToken();
	String token3=obj.nextToken();
	System.out.println("Society name: "+token1);
	System.out.println("Wing: "+token2);
	System.out.println("Flat info: "+token3);

