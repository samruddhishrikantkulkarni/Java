class StringDemo{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer(100);
		sb.append("Biencaps");
		sb.append("Core2web");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Incubator");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
