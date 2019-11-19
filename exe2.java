package method;

import java.util.*;

public class exe2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner ( System.in);
		
		double gasto ;
		
		System.out.println("Digite o total gasto:");
		gasto = in.nextDouble();
		
		System.out.println("");
		
		Menu();
		
		int menu ;
		
		menu = in.nextInt();
		
		if (menu==1) {
			
			System.out.println("Total com o Desconto Aplicado :");
			
			System.out.println("");
			
			System.out.println(Desconto(gasto));
			
		}
		
		if (menu==2) {
			
			System.out.println("O valor de Cada Parcela ser�:");
			
			System.out.println("");
			
			System.out.println(Duas(gasto));
			
		}
		
		if (menu==3) {
			
			int parcelas ;
			
			System.out.println("Digite a quantidade de Parcelas ");
			parcelas = in.nextInt();
			
			System.out.println("");
			
			if (gasto>=100) {
				
				System.out.println("Valor de Gasto V�lido");
				
				System.out.println("");
				
			}
			
			else {
				
				System.out.println("Valor de Gasto inv�lido");
				
				int status=0;
				
				System.exit(status);
				
			}
			
			if (parcelas>=11 || parcelas <3) {
				
				System.out.println("Valor de Parcela Inv�lido");
				
                int status=0;
				
				System.exit(status);
				
			}
			
			System.out.println("O valor de cada parcela ser�:");
			
			System.out.println("");
			
			System.out.println(Juros(parcelas,gasto));
			
			
			
			
		}
		
	}

	public static void Menu () {
		
		System.out.println("Suas Op��es :");
		
		System.out.println("");
		
		System.out.println("1-A vista com 10% de desconto");
		
		System.out.println("");
		
		System.out.println("2-Em duas vezes");
		
		System.out.println("");
		
		System.out.println("3-De 3 a 10 vezes com 3% de juros ao m�s,");
		
		System.out.println("somente para compras acima de R$100");
		
		System.out.println("");
		
		System.out.println("Selecione sua op��o de acordo com o Menu Acima:");
		
	}
	
	 public static double Desconto (double a) {
		 
		 double b = 0 ;
		 
		 double c = 0 ;
		 
		 b = a / 10 ;
		 
		 c = a - b ;
		 
		 return c ;
		 
		 
	 }
	 
	 public static double Duas (double v) {
		 
		 double d ;
		 
		 d = v / 2 ;
		 
		 return d ;
		 
	 }
	 
	 public static double Juros (int p ,double g) {
		 
		 double n ;
		 
			 for (int i=0;i<=p;i++) {
				 
				 g = g + (g*0.03);
				 
			 }
			 
			 n = g / p ;
		 
		return n;
		 
	 }
	
}
