package exe;
import java.util.*;
public class Two {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int valor  ;
		
		System.out.println("Digite um Número");
		valor = in.nextInt();
				
		tabuada(valor);
	}
	
	public static void tabuada(int valor) {
		
			for (int j=0;j<=10;j++) {
				System.out.println (valor+" x "+ j + " = " + valor*j);
			}
	}
}


