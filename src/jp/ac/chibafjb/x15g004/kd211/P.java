package jp.ac.chibafjb.x15g004.kd211;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] num = new int[100];
		int a = num.length;
		ArrayList x = new ArrayList();
		System.out.print("配列numの最大値は、"+x.maxFind1(num,a)+"です。\n");
		System.out.print("配列numの最大値は、"+x.maxFind2(num,a)+"です。\n");
	}
}
	class ArrayList{
		public int maxFind1(int num[],int a){
			int m = 0;
			int i = 0;
			while(i<a){
				if(num[i]>m){
					m = num[i];
				}
				i++;
			}
		return m;
		}
		public int maxFind2(int num[],int a){
			int i = 1;
			int m =num[0];
			while(i<a){
				if(num[i]>m){
					m = num[i];
				}
				i++;
			}
			return m;
		}
	}

