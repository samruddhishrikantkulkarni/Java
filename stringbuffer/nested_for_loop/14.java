//nested for loop
class NestedDemo{
	public static void main(String[] args){
		int n=4;
		char ch='*';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j==1 || j==n){
					System.out.print('*');
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
