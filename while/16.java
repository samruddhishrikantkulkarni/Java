class While{
	public static void main(String[] args){
		int i=6;
		int fact=1;
		while(i>=1){
			fact=fact*i;
			i--;
		}
		System.out.println(fact);
		System.out.println("Factorial of 6 is:"+fact);
	}
}
