//nested for loop
class NestedDemo{
	public static void main(String[] args){
		int n=4;
		int num=10;
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(num--);
			}
			System.out.println();
		}
	}
}
