package ro.unitbv.javadatatype.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {

	public static int[] remove(int[] vector, int index) {
		if (vector == null || index < 0 || index >= vector.length) {
			return vector;
		}
		int[] a1 = new int[vector.length - 1];
		for (int i = 0, k = 0; i < vector.length; i++) {
			if (i == index) {
				continue;
			}
			a1[k++] = vector[i];
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
		int a[] = {27, 33, 6, 21, 30, 99, 22, 4, 3, 12};
		System.out.println("Vectorul initial:\n" + Arrays.toString(a));
		//printArray(a); scriere fara paranteze
		Scanner s = new Scanner(System.in);
		System.out.print("Introdu index pentru eliminarea valorii:");
		int index2 = Ver(s, s.nextInt());

		a = remove(a, index2);
		System.out.println("\nVectorul modificat este: " + Arrays.toString(a));
	}
}
