//break statement
class Demo{
	public static void main(String[] args){
		int n=15;
		int count=0;
		for(int i=1;i<=15;i++){
			if(n%i==0){
				count++;
			}
			if(count>2){
				break;
			}
		}
		if(count==2){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not a prime number");
		}
	}
}
