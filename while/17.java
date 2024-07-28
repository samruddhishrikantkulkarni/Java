class While{
	public static void main(String[] args){
		int N=94211423;
		int count=0;
		int i=1;
		while(i<=N){
			int digit=i%10;
			N=N/10;
		count++;
		}
		System.out.println(count);
	}
}
