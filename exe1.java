package method;

import java.util.*;

public class exe1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double investido ;
		
		int meses ; 
		
		System.out.println("Digite o valor a ser Investido:");
		investido = in.nextDouble();
		
		System.out.println("");
		
		System.out.println("Digite o número de meses:");
		meses = in.nextInt();
		
		System.out.println(Investir(investido,meses));
		
	}
	
	
	public static Double Investir (double a , int b) {
		
		double c=0 , d=0;
	
	  for (int i=0;i<=b;i++) {
		  
			a = a + (a*0.01);
	
	  }
	  
	  return a ; 
		
	}

}
