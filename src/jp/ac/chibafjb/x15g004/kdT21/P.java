package jp.ac.chibafjb.x15g004.kdT21;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		int a;
		a = 100;
		int b;
		b = 180;
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数 --> ");
		int r =sin.nextInt();
		System.out.println("フライドポテトの個数 --> ");
		int m =sin.nextInt();
		System.out.println("ハンバーガーの代金   = "+r*a);
		System.out.println("フライドポテトの代金 = "+m*b);
		System.out.println("小計                 = "+((r*a)+(m*b)));
		double H =((r*a+m*b)*0.08);
		System.out.println("消費税 = "+(int)H);
		System.out.println("合計金額 = "+(int)((((r*a)+(m*b))+((r*a)+(m*b))*0.08)));
		
		System.out.println("受取金額 -->");
		double n =sin.nextDouble();
		System.out.println("つり銭 = "+(int)(n-((r*a)+(m*b)+((r*a)+(m*b))*0.08)));
		sin.close();
	}

}
