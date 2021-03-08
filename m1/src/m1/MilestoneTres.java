package m1;

import java.util.Arrays;

public class MilestoneTres {

	public static void main(String[] args) {
		
		int[] numerosOrigen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    for (int i = 0; i < numerosOrigen.length; ++i) {       
	          //System.out.println(numerosOrigen[i] + " ");

	    int primero = numerosOrigen[0];	    	
	    	for (int x = 0; x < numerosOrigen.length-1; x++) {	    			
	    			numerosOrigen[x] = numerosOrigen[x+1];	    			
	    	} 	    		
	    numerosOrigen[numerosOrigen.length-1] = primero;
	    //System.out.println(numerosOrigen[i] + " ");	    
	    System.out.println(Arrays.toString(numerosOrigen));
	    }

	}
}
