package ro.unitbv.javadatatype.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema3 {

	boolean binarySearch(int vector[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (vector[mid] == x)
				return true;

			if (vector[mid] > x)
				return binarySearch(vector, l, mid - 1, x);
			return binarySearch(vector, mid + 1, r, x);
		}
		return false;
	}

	public static void main(String[] args) {
		Problema3 o = new Problema3();
		int a[] = {2,4,6,9,11,21,22,30};
		int n = a.length;

		System.out.println("Sirul:\n" + Arrays.toString(a));
		Scanner s = new Scanner(System.in);
		System.out.print("Introduceti o valoare din vector :");
		int x = s.nextInt();
		s.close();
		boolean afis = o.binarySearch(a, 0, n - 1, x);
		if (afis == true)
			System.out.println("Elementul " +x+ " se afla in sir => " + afis);
		else
			System.out.println("Elementul " +x+ " nu se afla in sir => " + afis);
	}
}
