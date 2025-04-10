package AAA;

import java.util.Scanner;

public class MATRIZ1 {

	public static void main(String[] args) {
		Scanner ff = new Scanner(System.in);

		int n = ff.nextInt();
		int n1 = ff.nextInt();

		int[][] mat = new int[n][n1]; // o quadrado mostra como vai funcionar a matriz, essa no caso é bidimensional

		for (int i = 0; i < n; i++) { // o for da coluna
			for (int j = 0; j < mat[i].length; j++) { // o for da linha

				mat[i][j] = ff.nextInt();
			}
		}
		System.out.println("digite um numero que tem na matriz");
		int x = ff.nextInt(); // INICIA O CONTADOR

		for (int i = 0; i < mat.length; i++) { // o for da coluna
			for (Integer j = 0; j < mat[i].length; j++) { // o for da linha

				if (mat[i][j] == x) {

					System.out.println(i + "," + j);

					

					if (j > 0) {
						
						System.out.println("Left " + mat[i][j - 1]);
					}
					if (i > 0) {
						
						System.out.println("Left " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
 
						System.out.println("Right: " + mat[i][j + 1]);
					}

					if (i < mat.length - 1) {

						System.out.println("Down " + mat[i+1][j]);
					}

				}

			}
		}
		ff.close();

	}
}
