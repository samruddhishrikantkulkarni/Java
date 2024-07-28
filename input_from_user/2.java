import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Company name: ");
		String company=sc.next();
		System.out.println("Package: ");
		double packagevalue=sc.nextDouble();
		System.out.println(company);
		System.out.println(packagevalue);
	}
}
