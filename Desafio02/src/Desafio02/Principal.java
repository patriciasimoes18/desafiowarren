package Desafio02;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> horaChegada = new ArrayList<Integer>();
		
		horaChegada.add(-2);
		horaChegada.add(-1);
		horaChegada.add(0);
		horaChegada.add(1);
		horaChegada.add(2);
		
		int x=3;
		int horario = 0;		
		for(int i = 0; i <horaChegada.size(); i++ ) {
						
			if(horaChegada.get(i)<= 0) {
				horario++;
										
			}
		}
		if( horario >= x ) {
			
			System.out.println("Aula NORMAL");
			
		}else {
			System.out.println("Aula CANCELADA");
		}
	}
}
