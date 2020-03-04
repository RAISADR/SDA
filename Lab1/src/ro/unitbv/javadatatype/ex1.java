package ro.unitbv.javadatatype;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
			
			System.out.println("Introdu primul nr:");
			Scanner scanner = new Scanner(System.in);
			int nr1 = scanner.nextInt();
			System.out.println("numarul citit este:" +nr1);
			
			System.out.println("Introdu al doilea nr:");
			int nr2 = scanner.nextInt();
			System.out.println("numarul citit este:" +nr2);
			
			int suma = nr1+nr2;
			System.out.println("suma numerelor este:"+suma);
			
			int diferenta = nr1-nr2;
			System.out.println("diferenta numerelor este:"+diferenta);
			
			int produs = nr1*nr2;
			System.out.println("produsul numerelor este:"+produs);
			
			int media = (nr1+nr2)/2;
			System.out.println("media numerelor este:"+media);
			
			double impartire = (double)nr1/nr2;
			System.out.println("impartirea numerelor este:"+impartire);
			
			
	}

}
