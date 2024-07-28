class Array{
	static void fun(int arr[]){
		System.out.println(arr);
		arr[0]=700;
	}
	public static void main(String[] args){
		int arr[]={50,100,150};
		System.out.println(arr);
		fun(arr);
		System.out.println(arr);
	}
	}

