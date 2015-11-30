package jp.ac.chibafjb.x15g004.kd161;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a;
		a = new int[3];
		a[0] = 10;
		a[1] = 20;
		int work;
		work = a[1];
		a[1] =a[0];
		a[0] = work;
		
		System.out.println("test[0] = "+a[0]);
		System.out.println("rest[1] = "+a[1]);
	}

}
