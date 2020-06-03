package ro.unitbv.javadatatype.lab5;

import java.util.Random;

public class Prob1 {
	public static void main(String[] args) {
		Random o = new Random();
		int n=6;
		int mat [][] = new int[n][n];
		int[][] matri2 = new int[3][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = o.nextInt(255);
				System.out.print(mat[i][j] + "\t");
			}
			System.out.print("\n");
		}
		int suma=0, num=0, col, row;
		for (col=0; col<mat.length; col++) {
			for (row = 0; row < mat[col].length; row++) {
				suma = suma + mat[col][row];
				num++;
			}
		}
		double media = (double) suma/num ;
		System.out.println("Media="+media);
		impartMat(mat,matri2,3);
	}
	public static void impartMat(int matri1[][], int matri2[][], int n) {
		for (int row = 0; row < (matri1.length); row = row + n) {
			for (int col = 0; col < matri1[0].length; col = col + n) {
				for (int k = 0; k < n; k++) {
					for (int l = 0; l < n; l++) {
						matri2[k][l] = matri1[row + k][col + l];
						System.out.print(matri2[k][l] + "\t");

					}
					System.out.println();
				}
				
				System.out.println();
			}
		}
	}
}
