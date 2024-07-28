import java.io.*;
class Array{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter elements:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int count=0;
		for(int i=0;i<size;i++){
			 arr[i]=Integer.parseInt(br.readLine());
		}
			System.out.println("Even element count:");
		
		{
			for(int i=0;i<size;i++){
				if(arr[i]%2==0){
					count++;
				}
			}
			System.out.println(count++);
		}
	}
}
