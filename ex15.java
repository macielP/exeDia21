import java.util.*;
public class ex15{
    public static void main(String []args){
    	
    	
    	
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
        int ler = 0, n, i = 0, f;
        
        
         for(n = 0; n<10; n++){
            System.out.printf("Informe o %d numero\n",+1);
            a[n] = in.nextInt();
         }

            Arrays.sort(a);
            System.out.print("Crescente[ ");

             for(i = 0; i<10; i++){
                b[i] = a[i];
                System.out.printf(b[i]+" ");
             }

            System.out.println(" ]");
            System.out.print("Decrescente[ ");
            i=0;

             for(f = 9; f>=0; f--){
                c[f] = a[i];
                i++;
             }

             for(i = 0; i<10; i++){
                System.out.print(c[i]+" ");
                
             }
        System.out.println(" ]");
        

    }
}