/*
 * ���� ���������� ������� A ������� M (M � �������� �����). 
 * ������� � �������� A1,1 � ����������� �� ������� �������, 
 * ������� ��� �� �������� �� �������: 
 * ������ ������, ��������� �������, ��������� ������ � ��������  �������,  
 * ������  �������  �  ��������  �������, 
 * ����������  �������� ������ ������ � �. �.; 
 * ��������� ��������� ����������� ������� �������.
 */

package matrix;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		int n = 5;
		int[][] matrix = new int[n][n];
		Random random = new Random();
		System.out.println("Matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(100);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		int l=0,r=n-1;
		System.out.println("Result:");
		for(int counter = 0, i = 0, j = 0;counter<(matrix.length)*(matrix.length);counter++ ){
			System.out.print(matrix[i][j] + " ");
			if ((i == (l + 1)) && (j == l)) {
				r--;
				l++;
			}
			if ((j == r) && (i < r)) {
				i++;
				continue;
			}
			if ((j < r) && (i == l)) {
				j++;
				continue;
			}
			if ((i == r) && (j > l)) {
				j--;
				continue;
			}
			if ((j == l) && (i > l)) {
				i--;
				continue;
			}

		}

	}

}

