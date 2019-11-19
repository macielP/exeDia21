package exe;
import java.util.*;
public class One {
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
		
	int valor ;
	
	System.out.println("Digite Um valor");
	valor = in.nextInt();
	
	Potencia (valor);
		
	}
	public static void Potencia (int valor) {
		int valor1 , valor2 , valor3 ;
		
		valor1 = valor * valor ; 
		valor2 = valor1 * valor ; 
		valor3 = valor2 * valor ; 

		System.out.println(valor3);
		
	}
}
