package jp.ac.chibafjb.x15g004.kd173;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		int[] data;
		data = new int[4];
		System.out.println("data[0] = ");
		int d0 = sin.nextInt();
		data[0] = d0;
		System.out.println("data[1] = ");
		int d1 = sin.nextInt();
		data[1] = d1;
		System.out.println("data[2] = ");
		int d2 = sin.nextInt();
		data[2] = d2;
		
		System.out.println("data[0] = "+ d0);
		
		for (int p=3;p>0;p--){
			data[p]=data[p-1];
		}
		for(int s = 1;s<4;s++)
		System.out.println("data["+s+"] = "+data[s]);
			
		
		}
		
	}


