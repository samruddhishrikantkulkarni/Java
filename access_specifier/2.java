//Real time example
class Employee{
	int empID=10;
	String str="Kanha";
	void empInfo(){
		System.out.println("ID= "+empID);
		System.out.println("Name= "+str);
	}
}
class MainDemo{
	public static void main(String[] args){
		Employee emp1=new Employee();
		emp1.empInfo();
		System.out.println(emp1.empID);
		System.out.println(emp1.str);
	}
}
