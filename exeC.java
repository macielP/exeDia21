import java.util.*;
public class exeC {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int a[][] = new int [4][3];
		int r = 0, r2 = 0, r3 = 0;
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 3; i++) {
				System.out.println("Digite o valor "+(i+1)+"º valor");
				a[i][j] = in.nextInt();
			}
		}
		
		for(int j2 = 0; j2 < 3; j2++) {
			for(int i2 = 0; i2 < 3; i2++) {
				if(j2 == 0) {
					r += a[i2][j2];
				}
				if(j2 == 1) {
					r2 += a[i2][j2];
				}
				if(j2 == 2) {
					r3 += a[i2][j2];
				}
			}
		}
		
		
			System.out.println(a[0][0]+" + "+a[1][0]+" + "+a[2][0]+" = "+r);
				
			System.out.println(a[0][1]+" + "+a[1][1]+" + "+a[2][1]+" = "+r2);
				
			System.out.println(a[0][2]+" + "+a[1][2]+" + "+a[2][2]+" = "+r3);
			
			
		
		
	}

}

