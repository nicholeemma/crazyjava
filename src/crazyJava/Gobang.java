package crazyJava;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
public class Gobang {
static //�������̴�С
	int Xpos;
static int Ypos;
	private static int boardsize=15;
	//�����ά���鵱����
	private String[][] board;
	public void initboard() {
		board=new String[boardsize][boardsize];
		for(int i=0;i<boardsize;i++) {
			for (int j=0;j<boardsize;j++) {
				board[i][j]="+";
			}
		}
	}
	public void printboard() {
	
		for(int i=0;i<boardsize;i++) {
			for (int j=0;j<boardsize;j++) {
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}
	public boolean Iswin(String[][] board) {
		
		int samecount=0;
		int wincount=4;
		//������
		if((Xpos-3)<=0) {
			for (int i=0;i<=5;i++) {
				if ((board[Ypos-1][i]=="@")&&(board[Ypos-1][i+1]=="@")){
					samecount++;
					if (samecount==wincount) {
						break;
						//return true;
					}
				}
			}
		}
		else if(15-Xpos<=2){
			for (int i=Xpos-3;i<=Xpos+2;i++) {
				if ((board[Ypos-1][i]=="@")&&(board[Ypos-1][i+1]=="@")){
					samecount++;
					if (samecount==wincount) {
						break;
						//return true;
					}}
		}}
		else {for (int i=Xpos-3;i<=Xpos+2;i++) {
				if ((board[Ypos-1][i]=="@")&&(board[Ypos-1][i+1]=="@")){
					samecount++;
					if (samecount==wincount) {
						break;}
			
		}}}
		
		
		if (samecount==wincount) {return true;}
		else {return false;}}
	public boolean Iswin2(String[][] board) {
		
		int samecount=0;
		int wincount=4;
		//������
		if((Ypos-3)<=0) {
			for (int i=0;i<=5;i++) {
				if ((board[i][Xpos-1]=="@")&&(board[i+1][Xpos-1]=="@")){
					samecount++;
					if (samecount==wincount) {
						break;
						//return true;
					}
				}
			}
		}
		else if(15-Ypos<=2){
			for (int i=Ypos-3;i<=Ypos+2;i++) {
				if ((board[i][Xpos-1]=="@")&&(board[i+1][Xpos-1]=="@")){
					samecount++;
					if (samecount==wincount) {
						break;
						//return true;
					}}
		}}
		else {for (int i=Ypos-3;i<=Ypos+2;i++) {
				if ((board[i][Xpos-1]=="@")&&(board[i+1][Xpos-1]=="@")){
					samecount++;
					if (samecount==wincount) {
						break;}
			
		}}}
		if (samecount==wincount) {return true;}
		else {return false;}
	}
	public static void main(String[] args) throws Exception {
		Gobang bd= new Gobang();
		bd.initboard();
		bd.printboard();
		System.out.println("������");
		//scanner �о�һ��
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
	
		
		while (a==1) {
			System.out.println("��������������꣬������X");
			BufferedReader keyinput= new BufferedReader(new InputStreamReader(System.in));
			Xpos= Integer.parseInt(keyinput.readLine());
			//System.out.println(Xpos);
			System.out.println("��������������꣬����Y");
			BufferedReader keyinput2= new BufferedReader(new InputStreamReader(System.in));
			Ypos= Integer.parseInt(keyinput2.readLine());
			//System.out.println(Ypos);
			if(bd.board[Ypos-1][Xpos-1]!="+") {
	    	
				System.out.println("�Ѿ���������,����������");
				bd.printboard();
			}
			bd.board[Ypos-1][Xpos-1]="@";
			bd.printboard();
			if(bd.Iswin(bd.board)==true||bd.Iswin2(bd.board)==true) {
				System.out.println("you win");
				break;
			}
			System.out.println("�����������");
	    //������� x ���꣬����ά�������һά��ֵ 
			int posX = (int)(Math.random() * ( boardsize - 1 ) ); 
	    //������� y ���꣬����ά��������ά��ֵ 
			int posY = (int)(Math.random() * ( boardsize - 1 ) ); 
	    //�������е�λ�ò��ǡ�ʮ����ʱ���Ѿ������ӣ������ٴ������µ����� 
			while( bd.board[posX][posY] != "+"  ) 
			{   posX = (int)(Math.random() * ( boardsize - 1 ) );  
	    		posY = (int)(Math.random() * ( boardsize - 1 ));   } 
			bd.board[posX][posY]="O";
			bd.printboard();}	
	}}

