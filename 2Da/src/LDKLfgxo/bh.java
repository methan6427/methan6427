package LDKLfgxo;

public class bh {

	public static void main(String[] args) {
		
		System.out.print(sumColumn());
		
	}
	public static double sumColumn() {
		int sum=0;
		double [][] m = { { 1.5, 2,3,4 }, { 5.5,6,7,8 }, { 9.5, 1,3,1 } };
		for (int i = 0; i < m.length; i++) {
			System.out.println("");
			for (int j = 0; j < m.length; j++) {
				m[0][j]+=sum;
			}
			System.out.println(sum);
		}
		return sum;
	}

}
