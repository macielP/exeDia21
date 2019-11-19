import java.util.Random;
public class Matriz1 {
	public static void main(String[] args) {
		int v[] []=new int[3] [3];
		int i,j;
		Random x =new  Random ();
		for (i=0; i<=2;i++) {
			for(j=0;j<=2;j++) {
		v[i] [j]= x.nextInt() %10;
		
			
			}
  
  
}
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.print("["+v[i] [j] +")]");
				if(j==2) {
					System.out.println("\n");
				}
			}
		}
}
}