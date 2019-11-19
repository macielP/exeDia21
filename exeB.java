import java.util.Random;
public class exeB {
	public static void main(String[]args) {
		Random in = new Random();
		
		int a[][] = new int [3][3], maior = 0,menor=0,linha = 0,coluna=0, linhaN = 0,colunaN = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print("<=>");	
			a[i][j] = in.nextInt();
			
			 maior = a[0][0];
		 	 menor = a[0][0];
			}
		}
		 	for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {	
				if ( maior < a[i][j] ) {
					maior =	a[i][j];

					linha = i;
					coluna = j;
							
				}				
				
				if ( menor > a[i][j] ) {
					menor = a[i][j];
					
					  linhaN = i;
					  colunaN = j;
				
				}
				
			}
		 	
		}
		 	System.out.println("O numero Maior é:  ["+maior+"] | coluna  "+(coluna+ 1)+" linha "  + linha);
		 	System.out.println(" O número Menor é:  ["+menor+"] |  coluna "+(colunaN +1)+"  linha  "+linhaN);
	}
}


