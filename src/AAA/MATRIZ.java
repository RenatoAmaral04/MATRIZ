package AAA;

import java.util.Scanner;

public class MATRIZ {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		int n = ff.nextInt();

		int[][] mat = new int[n][n]; // o quadrado mostra como vai funcionar a matriz, essa no caso é bidimensional

		for (int i = 0; i < mat.length; i++) { // o for da coluna
			for (int j = 0; j < mat[i].length; j++) { // o for da linha

				mat[i][j] = ff.nextInt(); // recebe a posição do i e do j
			}
		}
		System.out.println("DIAGONAL PRINCIPAL");
		for (int i = 0; i < mat.length; i++) {

			System.out.print(mat[i][i] + " "); // a diagonal principal, o numero da coluna e da linha são sempre iguais
		}
		
		System.out.println();
		
		//numeros negativos
		int cont = 0; //INICIA O CONTADOR
		for (int i =0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				
				//OS DOIS FOR, SÃO PARA PERCORRER A MATRIZ
				
				if(mat[i][j] <0 ) {
										//SE A POSIÇÃO QUE ELES SATÃO PASSANDO, O NUMERO FOR MENOR DO QUE 0
					cont ++; //SE FOR MENOR DO QUE 0, O CONTADOR ADICIONA
				}
			}
		}
		

		System.out.println("NUMEROS NEGATIVOS " + cont );
	}

}
