package jp.ac.chibafjb.x15g004.kd152;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r-->");
		float r =sin.nextFloat();
		sin.close();
		System.out.println("円周 = "+(2*3.14*r));
		System.out.print("面積　= "+(3.14*r*r));
	}

}
