/*
 * В одномерном массиве сначала положительные потом отрицательные за О(n)
 */
package sort;

public class Task2 {

	public static void main(String[] args) {		
		int[] array = {0,1,2,3,100,-4,3,45,0,-19,-8,-111, -666, 0};
		
		System.out.println("Array before sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");			
		}
		int temp = 0;
		int positiveEnd = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] >= 0) {
				temp = array[i];
				array[i] = array[positiveEnd];
				array[positiveEnd] = temp;
				positiveEnd++;
			}
		}
		System.out.println();
		System.out.println("Array after sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");			
		}

	}

}
