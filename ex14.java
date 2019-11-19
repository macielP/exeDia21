import java.util.*;
public class ex14{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);

    int a[] = new int [10];
    int b[] = new int [10];
    int c[] = new int [10];

    int i = 0;

    for(i=0; i<10; i++){

        System.out.println("Informe o numero ");
        a[i] = in.nextInt();

        System.out.println("Informe o numero ");
        b[i] = in.nextInt();

        if(a[i]>b[i]){
            c[i] = 1;
        }

        else if(a[i]==b[i]){
            c[i] = 0;
        }

        else if(a[i]<b[i]){
            c[i] = -1;
        }


    }

	
    for(i=0; i<10; i++){

         System.out.println(c[i]);
    }
    
    


}
}