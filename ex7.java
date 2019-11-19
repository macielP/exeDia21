import java.util.*;
public class ex7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a [] = new int [15]; int b [] = new int [15];
		int r, r2 = 0, r3 = 0;
		for(int i = 0; i <15; i++) {
			System.out.println("Digite o "+(i+1)+"º valor");
			a[i] = in.nextInt();
			r = a[i];
			r2 = r;
			for(int i2 = 1; i2 < a[i]; i2++) {
				r2--;
				r3 = r2 * r;
				r = r3;
				System.out.println(a[i]+" = "+r2);
				
			}
			System.out.println(a[i]+" = "+r3);
			
		}
		System.out.println("Final Meu Amigo");
	}

}
