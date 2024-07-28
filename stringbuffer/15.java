//implementation of length method
import java.io.*;
class StringDemo{
	static int myStrLen(String str){
		char arr[]=str.toCharArray();
		int count=0;
		for(int x:arr){
			count++;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		String str=br.readLine();
		int len=myStrLen(str);
		System.out.println("Length of given string is:"+len);
	}
}
