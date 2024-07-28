class While{
public static void main(String[] args){
	int N=2332;
	int reverse=0;
	int temp=N;
	while(N!=0){
		int remainder=N%10;
		reverse=(reverse*10+remainder);
		N=N/10;
	}
		if(temp==reverse){
			System.out.println("It is palindrome");
		}else{
			System.out.println("It is not palindrome");
		}
}
}
