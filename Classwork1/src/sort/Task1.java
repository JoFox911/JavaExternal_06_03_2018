/*
 * Упорядочить в одномерном массиве вначале отрицательные по возрастанию 
 * затем положительные по убыванию.
 */
package sort;

public class Task1 {

	public static void main(String[] args) {		
		int[] array = {1,2,3,100,-4,3,45,-19,-8,-111, -666};
		int temp=0;
		System.out.println("Array before sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");			
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > 0 && array[j] > 0 && array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;										
				}
				else {
					if(array[i] > array[j] && array[i] < 0 && array[j] < 0){
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
					else 
						if(array[i] > 0 && array[j] < 0){
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
				}
			}	
		}
		System.out.println();
		System.out.println("Array after sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");			
		}

	}

}
