package ro.unitbv.javadatatype.lab5;

import java.util.Arrays;

public class sortare {
	int partition(int arr[], int lowIndex, int highIndex) {
		int pivot = arr[highIndex];
		int i = (lowIndex - 1);
		for (int j = lowIndex; j < highIndex; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[highIndex];
		arr[highIndex] = temp;
		return i + 1;
	}

	void sort(int arr[], int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int pi = partition(arr, lowIndex, highIndex);
			sort(arr, lowIndex, pi - 1);
			sort(arr, pi + 1, highIndex);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 101, 37, 68, 29, 11, 5 };
		System.out.println("Sirul initial:\n" + Arrays.toString(arr));
		int n = arr.length;
		sortare ob = new sortare();
		ob.sort(arr, 0, n - 1);
		System.out.println("Sirul sortat:\n" + Arrays.toString(arr));
		
	}
}
