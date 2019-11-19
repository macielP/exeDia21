import java.util.*;
public class ex11 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int a[] = new int [10];
		int i3 = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite "+(i+1)+"° Número inteiro");
			a[i] = in.nextInt();
		}
		
		System.out.println("Digite sua Procura");
		int num = in.nextInt();
		
		for(int i2 = 0; i2 < 10; i2++) {
			if(num == a[i2]) {
				System.out.println(num+" está em A");
				i2 = 11;
				i3 = 1;
			}
			
		}
		if(i3 != 1) {
			System.out.println("Não Achei");
		}
	}

}

