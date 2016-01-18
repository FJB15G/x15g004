package jp.ac.chibafjb.x15g004.kd171;

public class P {

	public static void main(String[] args) {
		int[] data;
		data = new int[4];
		data[0] = 100;
		data[1] = 200;
		data[2] = 300;
		data[3] = 0;
		int i = 0;
		System.out.println("data["+(i+1)+"] = "+data[i]);
		int k;
		for(k=3;k>0;k--){
		data[k] = data[k-1];
		}
	for(int a = 1;a<4;a++){
		System.out.println("data["+a+"] = "+data[a]);
	}
	}

}
