import java.util.*;
public class exe {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int saida;
		
		System.out.println("Deseja Executar ?");
		System.out.println("Deseja Finalizar ?");
		System.out.println("");
		System.out.println("Executar = 1");
		System.out.println("Finalizar = 0");
		
		System.out.println("Digite segundo as informações acima");
		saida = in.nextInt();
		
		
		Parada(saida) ;
		
		
		
		int menu , fator , tabu;
		
		System.out.println("");
		System.out.println("Digite sua Opção");
		menu = in.nextInt();
		
		if(menu==1) {
			System.out.println("Digite o valor a ser Aplicado o fatorial");
			fator = in.nextInt();
			
			Fatorial(fator);
		}
		
		else if (menu==2) {
			
			System.out.println("Digite o número");
			tabu = in.nextInt();
			
			Tabuada(tabu);
			
		}
		
		else if (menu==3) {
			
			int gen;
			int anos;
			
			System.out.println("Masculino = 1");
			System.out.println("");
			System.out.println("Feminino = 2");
			System.out.println("");
			System.out.println("Digite o sexo segundo a Tabela ");
			gen = in.nextInt();
			
			System.out.println("Digite sua Idade");
			anos = in.nextInt();
			
			Aposentadoria(gen,anos);
			
			
		}
		
		else if (menu==4) {
			
			int bas , exp ;
			
			System.out.println("Digite o Número a ser Potencializado");
			bas = in.nextInt();
			
			System.out.println("Digite o Expoente");
			exp = in.nextInt();
			
			Potencia (bas,exp);
			
		}
		
	}
	
	public static void Fatorial (int a) {
		
		int i=1,total=0, r=1;
		
		while(i<=a) {
			total=r*i;
			r=total;
			i++;
		}
		System.out.println("O resultado é: "+total);
			
	}
	
	public static void Tabuada(int valor) {
		
		for (int j=0;j<=10;j++) {
			System.out.println (valor+" x "+ j + " = " + valor*j);
		}
}
	
	public static void Aposentadoria (int sexo, int idade) {
		int aposentarMen = 65 , aposentarWomen = 60 ;
		
		int resu1, resu2;
		
	
		if (sexo==1) {
			
			resu1 = aposentarMen - idade ;
			
			System.out.println("Falta "+ resu1 + "Para sua aposentadoria");
			
		}
		else if (sexo==2) {
			resu2 = aposentarWomen - idade ;
			
			System.out.println("Falta "+ resu2 + "Para sua aposentadoria");
		}
		
		
	}
	
	public static void Potencia (int base,int expo) {
		
		int a=1;
		
		for (int i=0; i<=expo; i++) {
		
			a = a*base ; 
			
		}
		
		System.out.println(a);
		
		
	}
	
	public static void Menu () {
		
		System.out.println("Menu:");
		System.out.println("");
		System.out.println("1-Fatorial");
		System.out.println("2-Tabuada");
		System.out.println("3-Sexo e Idade");
		System.out.println("4-Potência");
		System.out.println("5-Sair");
		
	}
	
	public static void Parada (int valor) {
		
			
			if (valor==1) {
				Menu();
			}
			else if (valor==2) {
				System.exit(0);
			}
			
	}
	
}