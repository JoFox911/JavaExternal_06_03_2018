/*
 * не совсем понятно из описания задания для чего нужно 
 * IFly, ISwim, IMove массивы создавать,если сортировку 
 * можно показать на примере одного
 */

package main;

import java.util.Arrays;

import cars.*;

public class Main {

	public static Car min(Car [] cars){
		Car min = cars[0];
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].compareTo(min) < 0){
				min = cars[i];
			}
		}
		return min;
	}
	
	public static Car max(Car [] cars){
		Car max = cars[0];
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].compareTo(max) > 0){
				max = cars[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Car bc1 = new BatCar("Bats",150,1000000,2017);
		Car bc2 = new BatCar("Joker",250,11000000,2018);
		Car bc3 = new BatCar("Robin",100,50000,2010);
		Car ac1 = new Amphibian("GoldenFish",100,1000000,2017);
		Car ac2 = new Amphibian("Shark",100,11000000,2018);
		Car ac3 = new Amphibian("Fugu",100,50000,2010);
		Car [] masObj = new Car[6];
		masObj[0] = bc1;
		masObj[1] = bc2;
		masObj[2] = bc3;
		masObj[3] = ac1;
		masObj[4] = ac2;
		masObj[5] = ac3;		
		Arrays.sort(masObj);
		
		for (int i = 0; i < masObj.length; i++) {
			System.out.println(masObj[i]); 			
		}
		
		System.out.println("Min: " + min(masObj).toString());
		System.out.println("Max: " + max(masObj).toString());
	}

}
