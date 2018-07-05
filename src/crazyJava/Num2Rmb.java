package crazyJava;

import java.util.Arrays;

public class Num2Rmb {
	
	private String[] hanArr= {"��","һ","��","��","��","��","��","��","��","��"};
	private String[] unitArr= {"ʮ","��","ǧ","��","ʮ","��","ǧ","��"};
	private String[] divide(double num) {
		long zheng=(long)num;
		//ǿ������ת����������ֱ��ȡ����
		long xiao=Math.round((num-zheng)*100);
		return new String[] {zheng+" ",String.valueOf(xiao)};
	}
	private String toHanString(String numstr) {
		String result="";
		int numLen=numstr.length();
		for(int i=0;i<numLen;i++) {
			int num=numstr.charAt(i)-48;
			if(i!=numLen-1 && num!=0) {
				result+=hanArr[num]+unitArr[numLen-2-i];
			}
			else {
			//	result+=hanArr[num];
			}
		}return result;
	}
	public static void main(String[] args) {
		Num2Rmb nr = new Num2Rmb();
		System.out.println(Arrays.toString(nr.divide(2342341.67)));
		System.out.println(nr.toHanString("3450340"));
		/*long test=2342341;
		double test1=2342341.67;
		double test2=(double)test;
		System.out.println((long)(test1-test2)*100);*/
	}
}
