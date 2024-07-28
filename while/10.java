class While{
	public static void main(String[] args){
		int num=6531;
		int sum=0;
		int N=num;
		while(N!=0){
			int rem=N%10;
			sum=sum+rem;
			 N=N/10;
		}
			 System.out.println(sum);
		}
	}

