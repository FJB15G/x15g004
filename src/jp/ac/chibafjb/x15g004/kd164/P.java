package jp.ac.chibafjb.x15g004.kd164;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a;
		a = new int[3];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		int[] b =new int [3];
		int m = 0;
		m = a.length;
		int i= 0;
		for(;i<m;i++){
		b[i] = a[i];
		System.out.println("b["+i+"] = "+ b[i]);
		}
		
	}

}
