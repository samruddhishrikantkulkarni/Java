//implementation of concat method
import java.io.*;
class StringDemo{
	static char[] myStrConcat(char arr1[],char arr2[]){
		char arr3[]=new char[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			arr3[arr1.length+i]=arr2[i];
		}
		return arr3;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string");
		String str1=br.readLine();
		System.out.println("Enter second string");
		String str2=br.readLine();
		System.out.println(myStrConcat(str1.toCharArray(),str2.toCharArray()));
	}
}
