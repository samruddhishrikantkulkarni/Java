//input using bufferedreader
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter player name: ");
		String name1=br.readLine();
		System.out.println("Enter jer no: ");
		int jerNo=Integer.parseInt(br.readLine());
		System.out.println("Enter avg: ");
		float avg=Float.parseFloat(br.readLine());
		System.out.println(name1);
		System.out.println(jerNo);
		System.out.println(avg);
	}
}
