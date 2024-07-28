//input using bufferedreader
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter building name: ");
		String name1=br.readLine();
		System.out.println("Enter wing: ");
		char wing=(char)br.read();
		br.skip(1);
		System.out.println("Enter flat no.: ");
		int flatNo=Integer.parseInt(br.readLine());
		System.out.println(name1);
		System.out.println(wing);
		System.out.println(flatNo);
	}
}
