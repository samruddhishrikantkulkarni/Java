class While{
	public static void main(String[] args){
		int day=7;
		int i=7;
		while(i<=day){
			if(i>=1){
				System.out.println(i+"days remaining");
			}else if(i==0){
				System.out.println(i+" day assignment is overdue");
			}
			i--;
		}
	}
}
