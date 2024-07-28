//nested for loop
class NestedDemo{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			char ch='A';
			int n=1;
			for(int j=1;j<=4;j++){
				if(j%2!=0){
					System.out.print(ch++);
				}else{
					System.out.print(n++);
				}
			}
			System.out.println();
		}
	}
}
