
package Desafio01;

import java.util.ArrayList;

public class Principal{
	
   public static void main(String[] args){
	   
	   ArrayList<Integer> numeros = new ArrayList<Integer>();
	   
	   for(int i = 1; i < 1000; i++){
		   if ((i + reverso(i)) % 2 != 0){
			   String valor1 = String.valueOf(i);
			   String valor2 = String.valueOf(reverso(i));
			   
			   
			   if (Integer.parseInt(valor1.substring(valor1.length() - 1)) != 0 
				  && (Integer.parseInt(valor2.substring(0,1)) != 0)  
				  && ((i + reverso(i)) < 1000000)){
				   numeros.add(i);
			   }
			  
            }
        }
	   
	   for(int i=0; i<numeros.size(); i++ ) {
		   System.out.println(numeros.get(i));
	   }
	   
   }

   private static int reverso(int valor){
	   int resultado = 0;
	   
	   while (valor > 0){
		   resultado = 10 * resultado + valor % 10;
		   valor /= 10;
	   }
	   
	   return resultado;            
   }

}



