package crazyJava;

import java.util.Arrays;

public class Num2Rmb {
	
	private String[] hanArr= {"零","一","二","三","四","五","六","七","八","九"};
	private String[] unitArr= {"十","百","千","万","十","百","千","亿"};
	private String[] divide(double num) {
		long zheng=(long)num;
		//强制类型转换不能用来直接取整数
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
