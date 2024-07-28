import java.io.*;
class Array{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size: ");
		 int size = Integer.parseInt(br.readLine());
		System.out.println("Enter elements:");
		int arr[] = new int [size];
		int sum=0;
		for(int i=0;i<size;i++){
			 arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<size;i++){
			sum=sum+arr[i];
			System.out.println(sum);
		}
	}
}
