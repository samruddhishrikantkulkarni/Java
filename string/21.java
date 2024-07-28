import java.io.*;

class StringDemo{
	static int MyStrlen(String str3){
		char arr[]=str3.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		if(MyStrlen(str1)==MyStrlen(str2)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
	}
}
