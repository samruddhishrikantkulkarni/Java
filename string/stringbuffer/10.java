class StringDemo{
        public static void main(String[] args){
                String str1="Shahsi";
                String str2=new String("Bagal");
                StringBuffer str3=new StringBuffer("Core2web");
                str1= str1.concat(str2);
                str2= str2.append(str2);
                System.out.println(str1);
                System.out.println(str2);
                SYstem.out.println(str3);
        }
}
