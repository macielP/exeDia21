 import java.util.*;
public class ex6{
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int a[] = new int [11];
    	int i, nas=1, n=1, b=0;
    	for(i=0; i<11; i++){
    		a[i] = i;
    		if(a[i]==0){
    			b = 1;
    			System.out.println(b);
    		}
    		else{
    			for(nas = 1,n=1; n<=a[i]; n++){
    				nas = nas * 2;
    			}
    			for (n=1; n<=a[i];n++) {
    				a[i] = nas;
    			}
    			System.out.println(a[i]);
    		}

    	}
    }
    
}

