class While{
	public static void main(String[] args){
		int n=7;
		while(n>=0){
			if(n%2!=0){
				System.out.println(n);
			}else{
				System.out.println("Wrong input");
			}
			n--;
		}
	}
}
