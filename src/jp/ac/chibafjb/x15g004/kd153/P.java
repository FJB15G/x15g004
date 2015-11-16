package jp.ac.chibafjb.x15g004.kd153;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		double r =sin.nextDouble();
		sin.close();
		System.out.println("円周　= "+2*3.1*r);
		System.out.println("面積　= "+3.1*r*r);	
	}

}
