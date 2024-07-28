//implementation of Repalce method
import java.io.*;
class StringDemo{
	static String myStrReplace(String str1,char ch1, char ch2){
		char arr[]=str1.toCharArray();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ch1){
				flag=0;
				arr[i]=ch2;
			}
		}
		String str2=new String(arr);
		if(flag==0){
			return str2;
		}else
			return null;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String: ");
		String str1=br.readLine();
		System.out.println("Enter old character to replace: ");
		char ch1=(char)br.read();
		br.skip(1);
		System.out.println("Enter new character to replace: ");
		char ch2=(char)br.read();
		br.skip(1);
		String str=myStrReplace(str1,ch1,ch2);
		System.out.println("After repalce: "+str);
	}
}
