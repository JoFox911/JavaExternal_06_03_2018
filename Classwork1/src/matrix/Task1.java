/*
 * Упорядочить столбцы по убыванию среднего значения. 
 */

package matrix;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		int n = 5;
		int[][] matrix = new int[n][n];
		Random random = new Random();
		System.out.println("Matrix before sort:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(5);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		double[] average = new double[n];		
		for (int i = 0; i < average.length; i++) {
			double currentColumn = 0;
			for (int j = 0; j < matrix.length; j++) {
				currentColumn += matrix[j][i];
			}
			average[i] = currentColumn / matrix.length;
		}
		
		double temp = 0;
		for (int i = 0; i < matrix[0].length; i++) {			
			for (int j = i; j < matrix[0].length; j++) {
				if(average[i] < average[j]) {
					for (int k = 0; k < matrix.length; k++) {						
						temp = matrix[k][i];						
						matrix[k][i] = matrix[k][j];
						matrix[k][j] = (int) temp;
					}
					temp = average[i];						
					average[i] = average[j];
					average[j] = temp;
				}
				
			}
		}
		
		System.out.println("Matrix after sort:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}

