package crazyJava;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
public class Gobang {
static //定义棋盘大小
	int Xpos;
static int Ypos;
	private static int boardsize=15;
	//定义二维数组当棋盘
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
		//横向检测
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
		//竖向检查
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
		System.out.println("下棋吗");
		//scanner 研究一下
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
	
		
		while (a==1) {
			System.out.println("请输入下棋的坐标，先输入X");
			BufferedReader keyinput= new BufferedReader(new InputStreamReader(System.in));
			Xpos= Integer.parseInt(keyinput.readLine());
			//System.out.println(Xpos);
			System.out.println("请输入下棋的坐标，输入Y");
			BufferedReader keyinput2= new BufferedReader(new InputStreamReader(System.in));
			Ypos= Integer.parseInt(keyinput2.readLine());
			//System.out.println(Ypos);
			if(bd.board[Ypos-1][Xpos-1]!="+") {
	    	
				System.out.println("已经有棋子了,请重新输入");
				bd.printboard();
			}
			bd.board[Ypos-1][Xpos-1]="@";
			bd.printboard();
			if(bd.Iswin(bd.board)==true||bd.Iswin2(bd.board)==true) {
				System.out.println("you win");
				break;
			}
			System.out.println("下面电脑下棋");
	    //随机生成 x 坐标，即二维数组具体一维的值 
			int posX = (int)(Math.random() * ( boardsize - 1 ) ); 
	    //随机生成 y 坐标，即二维数组具体二维的值 
			int posY = (int)(Math.random() * ( boardsize - 1 ) ); 
	    //当棋盘中的位置不是“十”的时候（已经有棋子），则再次生成新的坐标 
			while( bd.board[posX][posY] != "+"  ) 
			{   posX = (int)(Math.random() * ( boardsize - 1 ) );  
	    		posY = (int)(Math.random() * ( boardsize - 1 ));   } 
			bd.board[posX][posY]="O";
			bd.printboard();}	
	}}

