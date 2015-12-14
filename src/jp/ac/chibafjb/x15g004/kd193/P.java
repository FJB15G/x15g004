package jp.ac.chibafjb.x15g004.kd193;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
			int[] data;
			data = new int[4];
			int v0  = sin.nextInt();
			int v1 = sin.nextInt();
			int v2 = sin.nextInt();
			data[0]=data[v0];
			data[1]=data[v1];
			data[2]=data[v2];
			
			System.out.println("data[0] = "+data[0]);
			for(int i = 1;i<4;i++){
				data[i] = data[i-1];
			}
	//	System.out.println("data["+s+"] = "+data[s]);
	}

	}



