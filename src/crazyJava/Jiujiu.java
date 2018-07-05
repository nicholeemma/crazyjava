package crazyJava;
import java.io.*;
public class Jiujiu {
	public void form(int s) {
		for (int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.print("\n");
		}
	}
	public void triangle(int s) {
		for(int i=1;i<=s;i++) {
			for(int j=s-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int n=1;n<=2*i-1;n++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	/*public void circle(int s) {
		String circleset[][]=new String[2*s+1][2*s+1];
		for(int i=0;i<=2*s;i++) {
			for(int j=0;j<=2*s;j++) {
				if(Math.pow(i-s,2)+Math.pow(j-s,2)==Math.pow(s, 2)) {
					circleset[i][j]="*";
				}
				else {
					circleset[i][j]=" ";
				}
			}
			
		}
		for(int i=0;i<=2*s;i++) {
			for(int j=0;j<=2*s;j++) {
				System.out.print(circleset[i][j]);
			}
			System.out.print("\n");
		}
	}*/
	public void circle(int s) {
		for(int i=0;i<=2*s;i+=2) {
			//因为要做到半径都相同，*在某个整数的坐标很难，用math.round可以制作不太规则的圆
			int y=(int) Math.round(Math.sqrt(Math.pow(s, 2)-Math.pow(s-i, 2)));
				for (int j=0;j<=s-y;j++) {System.out.print(" ");}
			System.out.print("*");
				for(int n=0;n<=2*y;n++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader keyinput= new BufferedReader(new InputStreamReader(System.in));
		int size= Integer.parseInt(keyinput.readLine());
		System.out.println(size);
		Jiujiu table=new Jiujiu();
		table.form(size);
		table.triangle(size);
		table.circle(8);
	}
}
