//nested switch
class SwitchDemo{
	public static void main(String[] args){
		String str="Oh Pune";
		System.out.println("Before switch");
		switch(str){
			case "Veg":
				{
					String str1="Starter";
					switch(str1){
						case "Starter":
							System.out.println("Masala Papad");
							break;
						case "Main course":
							System.out.println("Paneer Masala");
							break;
					}
				}break;
			case "Non-veg":
				{
					String str1="Main course";
					switch(str1){
						case "Starter":
							System.out.println("Chicken");
							break;
						case "Main-course":
							System.out.println("Chicken-thali");
							break;
					}
				}break;
		}
		System.out.println("Thank you !");
	}
}
