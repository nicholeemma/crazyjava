package crazyJava;

public class SubString {
	@SuppressWarnings("unused")
	
	public static void main(String[] args) throws Exception{
		String eg= new String();
		eg="ÖÐÎÄabc";
	    byte[] buf=eg.getBytes("GBK");
	    int i=buf[0];
		System.out.println(eg.substring(1, 3));
	}
}
