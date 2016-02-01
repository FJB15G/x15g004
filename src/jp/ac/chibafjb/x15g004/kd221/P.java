package jp.ac.chibafjb.x15g004.kd221;

import java.util.ArrayList;
import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score[] = new int[100];
		score[99] = 999;
		int a = score.length;
			ArrayList x = new ArrayList();
			score[99] =999; 
			Scanner sin = new Scanner(System.in);
			String  n = sin.next();
			if(n == score[i]){	
			System.out.println("探索値"+n+"は配列score["+i+"]に存在します。");
			else{
				System.out.println("探索値"+n+"は配列score["+i+"]に存在しません")
				}
			
				class ArrayProc{
					public int linerSearch1(int s[],int n){
						int i = 0;
						while(i<100 && n !=s[i]){
							i = i + 1;
						}
						return i;	
					}
				}
			
			}
		
		}
}



