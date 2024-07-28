class While{
	public static void main(String[] args){
		int N=942111423;
		while(N!=0){
			int i=N%10;
			if(i%2==0){
				System.out.println(i*i);
			}
			N=N/10;
		}
	}
}
