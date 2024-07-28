class StringDemo{
	public static void main(String[] args){
		String str1="Ritika";
		String str2="Kulkarni";
		System.out.println(str1+str2);
		String str3="Ritika Kulkarni";
		String str4=str1+str2;
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(str4);
	}
}
