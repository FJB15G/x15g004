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
			
			
			System.out.println("data[0]="+v0);
			System.out.println("data[1]="+v1);
			System.out.println("data[2]="+v2);
			int i = 0;
			System.out.println("data[0] = "+v0);
		System.out.println("data["+(i+1)+"] = "+data[i]);
		int k = 3;
		for(;k>0;k--){
		data[k] = data[k-1];
		}
	for(int s = 1;s<4;s++){
		System.out.println("data["+s+"] = "+data[s]);
	}

	}
}


