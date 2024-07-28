//print number is a Amstrong number or not
class Demo{
	public static void main(String[] args){
		int n=153;
		int sum=0;
		int temp=n;
		for(int i=1;n!=0;i++){
			int rem=n%10;
			sum=sum+(rem*rem*rem);
				n=n/10;
		}
		if(temp==sum){
			System.out.println("Amstrong number");
		}
		else{
			System.out.println("Not a Amstrong number");
		}
	}
}
