package exe;
import java.util.*;
public class Three {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int matriz [] [] = new int [5] [5];
		 
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.println("Digite Um valor");
				matriz[i] [j] = in.nextInt();
			}
		}
				
		System.out.println(matriz [0] [0]);
		System.out.println(matriz [1] [1]);
		System.out.println(matriz [2] [2]);
		System.out.println(matriz [3] [3]);
		System.out.println(matriz [4] [4]);
		
		
		
		
		
	}
	
}
