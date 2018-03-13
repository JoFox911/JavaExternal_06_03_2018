/*
 * ”пор€дочить строки, по возрастанию, 
 * по самой длинной серии одинаковых элементов.
 */

package matrix;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		int n = 5;
		int[][] matrix = new int[n][n];
		Random random = new Random();
		System.out.println("Matrix before sort:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] max = new int[matrix.length];		
		for (int i = 0; i < max.length; i++) {
			int currentRow = 1;
			int currentInt = matrix[i][0];
			for (int j = 1; j < matrix[i].length ; j++) {
				if(matrix[i][j] == currentInt){
					currentRow++;
				}
				else {
					if(max[i]<currentRow)
						max[i] = currentRow; 
					currentRow = 1;
					currentInt = matrix[i][j];
				}
			}
			if(max[i]<currentRow)
				max[i] = currentRow;
		}
		
		for (int i = 0; i < max.length; i++) {
			System.out.print(max[i]+" ");
		}
		
		int temp = 0;
		for (int i = 0; i < matrix.length; i++) {			
			for (int j = i; j < matrix.length; j++) {
				if(max[i] < max[j]) {
					for (int k = 0; k < matrix[i].length; k++) {						
						temp = matrix[i][k];						
						matrix[i][k] = matrix[j][k];
						matrix[j][k] = temp;
					}
					temp = max[i];						
					max[i] = max[j];
					max[j] = temp;
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

