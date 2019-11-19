import java.util.*;
public class exeD {
	public static void main(String[] args) {
		Random input = new Random();
		Scanner in = new Scanner(System.in);
		
		int a[][] = new int [4][4];
		int num = 0, tt = 0;
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 4; i++) {
				 a[i][j] = (input.nextInt(75));
			}
		}
		
		int r = 0;
		while(r < 16) {
			System.out.println("Informe o número de 0 a 75");
			num = in.nextInt();
 			
			for(int j2 = 0; j2 < 4; j2++) {
				for(int i2 = 0; i2 < 4; i2++) {
					if(num == a[i2][j2]) {
						System.out.println("Acertou");
						r++;
					}
					

				}
			}
			tt++;
		}
		if(r == 16) {
			System.out.println("Bingo!");
			System.out.println("Tentativas até acertar "+tt);
		}
		
		
	}

}

