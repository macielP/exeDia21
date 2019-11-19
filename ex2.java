import java.util.*;
public class ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[] = new int [5];
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Digite o " + (i+1) + " número ");
			a[i] = in.nextInt();
			for (int j=0;j<=10;j++) {
				System.out.println (a[i]+" x "+ j + " = " + a[i]*j);
			}
		}
	}
}
