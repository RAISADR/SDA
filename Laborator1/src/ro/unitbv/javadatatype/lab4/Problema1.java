package ro.unitbv.javadatatype.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema1 {

	public static int[] addNr(int n, int vector[], int x, int pos) {
		int a1[] = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			if (i < pos - 1)
				a1[i] = vector[i];
			else if (i == pos)
				a1[i] = x;
			else
				a1[i] = vector[i - 1];
		}
		return a1;
	}

	public static int Ver(Scanner scanner, int cifra) {
		Scanner s = new Scanner(System.in);
		if (cifra < 0||cifra > 10) {
			System.out.print("Index gresit, introdu alt index:");
			cifra = Ver(s, s.nextInt());
		}
		return cifra;
	}

	public static void main(String[] args) {
		int n = 10;
		int a[] = {27,33,6,21,30,99,22,4,3,12};
		System.out.println("Vectorul initial:\n" + Arrays.toString(a));

		Scanner s = new Scanner(System.in);
		System.out.print("Introdu valoarea:");
		int valoare = s.nextInt();

		System.out.print("Introdu indexul:");
		int index = Ver(s, s.nextInt());

		a = addNr(n, a, valoare, index);
		System.out.println("\nCifra " +valoare+ " a fost introdusa la indexul " +index+ ":\nVectorul modificat este:" +Arrays.toString(a));
	}
}
