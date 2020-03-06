package ro.unitbv.javadatatype;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
			
			System.out.println("Introdu primul nr:");
			Scanner scanner = new Scanner(System.in);
			int nr1 = scanner.nextInt();
			System.out.println("Primul numar introdus este:" +nr1);
			
			System.out.println("Introdu al doilea nr:");
			int nr2 = scanner.nextInt();
			System.out.println("Al doilea numar introdus este:" +nr2);
			
			int suma = nr1+nr2;
			System.out.println("Suma numerelor este:"+suma);
			
			int diferenta = nr1-nr2;
			System.out.println("Diferenta numerelor este:"+diferenta);
			
			if (nr1>nr2)
				System.out.println("Distanta este:"+(nr1-nr2));
			else
				System.out.println("Distanta este:"+(nr2-nr1));
			
			int produs = nr1*nr2;
			System.out.println("Produsul numerelor este:"+produs);
			
			double media = (double)(nr1+nr2)/2;
			System.out.println("Media numerelor este:"+media);
			
			double impartire = (double)nr1/nr2;
			System.out.println("Impartirea numerelor este:"+impartire);
			
			if (nr1>nr2)
				System.out.println("Numarul maxim este:"+nr1);
			else
				System.out.println("Numarul maxim este:"+nr2);
			
			if (nr1<nr2)
				System.out.println("Numarul minim este:"+nr1);
			else
				System.out.println("Numarul minim este:"+nr2);
	}

}
