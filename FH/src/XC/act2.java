package XC;

public class act2 {
	public static void main(String[] args) {
		int [] n = new int [100];
		for (int i = 0; i < n.length; i++)
			n[i] = (int)(Math.random()*10);
		for (int i : n)
			System.out.print(n[i]+"\t");
		int [] counts = new int [10];
		for (int i = 0; i < n.length; i++)
			counts[n[i]]++;
		for (int i = 0; i < counts.length; i++)
			System.out.println("The count of "+i +" is "+counts[i]);
		
	}
}
