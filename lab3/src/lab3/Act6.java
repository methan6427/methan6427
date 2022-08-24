package lab3;

public class Act6 {

	public static void main(String[] args) {
		int sum=0;
		for(int i; i<10000; i++ ) {
			for(int j=i; j<1; j++ ) {
				if(i%j==0) {
					sum+=j;
					if(sum == i) {
					System.out.println(sum);
				
				}
			}
		}

	}

}
}