//try,catch block for NumberFormat exception
import java.io.*;
class ExceptionDemo{
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);
		int data=0;
		try{
		       int data=Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){
			System.out.println("Please enter integer data");
			data=Integer.parseInt(br.readLine());
		}
		System.out.println(data);
	}
}
