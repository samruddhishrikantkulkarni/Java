class StringDemo{
	public static void main(String[] args){
		String str1="Ritika";
		String str2="Kulkarni";
		System.out.println(str1);
		System.out.println(str2);
		str1.concat(str2);
		System.out.println(str1);
		System.out.println(str2);
		String str3=str1.concat(str2);
		System.out.println(str3);
	}
}
