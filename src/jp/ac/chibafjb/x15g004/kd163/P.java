package jp.ac.chibafjb.x15g004.kd163;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x[] = {33,18,102,47,5};
		int n = 0;
		n = x.length;
		int i = 0; 
		int sum = 0;
		for(;i<n;i++){
			sum = sum + x[i];	
		}	
			System.out.println("合計　＝　"+sum);
	}

}
