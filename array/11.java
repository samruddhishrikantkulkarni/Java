import java.util.*;
class Array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				count1++;
				System.out.println(count1);
			}else if(arr[i]%2!=0)                                            {
				count2++;
				System.out.println(count2);
			}
		}
	}
}
