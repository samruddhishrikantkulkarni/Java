//input using bufferedreader
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter batsman name: ");
		String name1=br.readLine();
		System.out.println("Enter bowler name: ");
		String name2=br.readLine();
		System.out.println("Enter batsman name: "+name1);
		System.out.println("Enter bowler name: "+name2);
	}
}
