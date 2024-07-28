//nested for loop
class NestedDemo{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			int n=4;
			char ch='A';
			for(int j=1;j<=n-i+1;j++){
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
