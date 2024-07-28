class Employee{
	int empID=10;
	String name="Kanha";
	void empInfo(){
		System.out.println("ID= "+empID);
		System.out.println("Name= "+name);
	}
}
class MainDemo{
	public static void main(String[] args){
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.empInfo();
		emp2.empInfo();
		emp2.empID=20;
		emp2.name="Rahul";
		emp1.empInfo();
		emp2.empInfo();
	}
}
