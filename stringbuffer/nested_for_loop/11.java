//Nested for
class NestedDemo{
	public static void main(String[] args){
		int n=3;
		for(int i=1;i<=3;i++){
			char ch='A';
			for(int j=1;j<=3;j++){
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
