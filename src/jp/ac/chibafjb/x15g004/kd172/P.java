package jp.ac.chibafjb.x15g004.kd172;

public class P {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x[] = {1,2,3};
		int y[] = {7,8};
		int z[] = new int[5];
		int i = 0;
		for(int a:x){
			z[i] = a;
			i=i+1;
		}
		i = 0;
		for(int a:y){
			z[x.length+i] = a;
			i = i+1;
		}
		System.out.print("z[] ={");
		int c = 0;
		for(int a:z){
			System.out.print(a+"");	
			
			if(c<4){
				System.out.print(",");
			c++;	
			}
	
		}
		System.out.print("}");
	}
}
