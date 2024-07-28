//Real time example
class Project{
	String projName="Online Edu";
	int noOfEmp=20;
	void clientInfo(){
		String clientName="Core2web";
		System.out.println(clientName);
		System.out.println(projName);
		System.out.println(noOfEmp);
	}
}
class C2W{
	public static void main(String[] args){
		Project obj=new Project();
		obj.clientInfo();
	}
}
