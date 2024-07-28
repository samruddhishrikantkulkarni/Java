//Real time example
class Company{
	double Package=300000;
	void criteria(){
		System.out.println("B.E Computer");
	}
	public static void main(String[] args){
		Company obj=new Company();
		Company obj1=new Company();
		Company obj2=new Company();
		obj.criteria();
		System.out.println(obj.Package);
	}
}
