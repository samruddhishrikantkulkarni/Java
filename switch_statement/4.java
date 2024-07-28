//switch statement
class SwitchDemo{
        public static void main(String[] args){
                String str="Mon";
                switch(str){
                        case "Mon":
                                System.out.println("Monday");
				break;
                        case "Tue":
                                System.out.println("Tuesday");
				break;
                        case "Wed":
                                System.out.println("Wednesday");
				break;
                        case "Thur":
                                System.out.println("Thursday");
				break;
                        case "Fri":
                                System.out.println("Friday");
				break;
			case "Sat":
				System.out.println("Saturday");
				break;
                        default:
                                System.out.println("Sunday");
				break;
                }
                System.out.println("After switch");
        }
}
