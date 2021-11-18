package org.generation.italy.cicli;
import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		//caricamento classi 
		Scanner scanner1 = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		//impostata lunghezza lista
		System.out.print("Quanto sarà lunga la lista?");
		int n = Integer.parseInt(scanner1.nextLine()); 
		int [] lista = new int[n];
		int numeriDispari= 0 ;
		int numeriPari = 0;
		int sommaNumeri = 0;
		

		//creazione numeri
		for(int i = 0; i < lista.length ; i ++) {
			lista[i] = randomGenerator.nextInt(100);
		
			
			
		//stampa numeri	
			if (lista[i] % 2 != 0 ) {
				System.out.print(lista[i] + "  ");
				numeriDispari += 1;
			}else {
				numeriPari += 1;
			}
			
		}
		System.out.println("Il numero di numeri Dispari è " + numeriDispari);
		System.out.println("Il numeri di numeri Pari è " + numeriPari);
		
		
		
		scanner1.close();

	}

}
