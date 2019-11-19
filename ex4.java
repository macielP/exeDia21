
import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[] = new int[10];
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Digite o " + (i+1) + " número ");
			a[i] = in.nextInt();
		
		
		
		for (int n=0;n<a[i];n++) {
			
		if(n % 2 == 0) {
			
			System.out.println(n);
		}
			
       		}
		
		}
	}
}