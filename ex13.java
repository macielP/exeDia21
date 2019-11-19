import java.util.*;
public class ex13{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
    int a[] = new int [10];
    int b[] = new int [10];
    int i = 0;
    for(i=0; i<10; i++){
        System.out.println("Informe o numero ");
        a[i] = in.nextInt();
        if(a[i]%2==0){
            b[i] = 1;
        }
        else{
            b[i] = 0;
        }
    }
    for(i=0; i<10; i++){
         System.out.println(b[i]);
    }
}
}

