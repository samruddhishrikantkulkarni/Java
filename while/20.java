class While{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		int product=1;
		while(i<=10){
			if(i%2==0){
				 sum += i;
			}else{
				product *= i;
			}
			i++;
		}
		System.out.println("Sum: " + sum);
        	System.out.println("Product: " + product);
	}
}
