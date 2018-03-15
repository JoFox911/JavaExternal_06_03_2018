package main;

import java.util.ArrayList;
import java.util.Scanner;

import vehicles.*;

public class Main {
	private static final double CURRENT_YEAR = 2018;

	public static void main(String[] args) {
		ArrayList<CVehicle> myVehicles = new ArrayList<CVehicle>();
		CCar c1 = new CCar(new —oordinates(100.1,23.2),100000,120,2003);
		CCar c2 = new CCar(new —oordinates(10,26),120000,130,2015);
		CPlane p1 = new CPlane(new —oordinates(10,26),120000,600,2002,1.5,600);
		CPlane p2 = new CPlane(new —oordinates(110,260),1200000,590,2001,1.5,600);
		CShip s1 = new CShip(new —oordinates(19,60),1200000,60,1997,1.5,"AveMaria");
		CShip s2 = new CShip(new —oordinates(99,120),1200000,76,2014,1.5,"DeusVult");
		CShip s3 = new CShip(new —oordinates(99,120),120000,76,2014,1.5,"Medival");
		CShip s4 = new CShip(new —oordinates(99,120),1205000,76,2014,1.5,"Hero");
		myVehicles.add(c1);
		myVehicles.add(c2);
		myVehicles.add(p1);
		myVehicles.add(p2);
		myVehicles.add(s1);
		myVehicles.add(s2);
		myVehicles.add(s3);
		myVehicles.add(s4);
		
		int ind = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("write: 1 to watch info about all vehicles");
			System.out.println("       2 to watch coordinates of all vehicles");
			System.out.println("       3 to change coordinates of vehicles");
			System.out.println("       4 to watch price of all vehicles");
			System.out.println("       5 to change price of vehicles");
			System.out.println("       6 to watch year of all vehicles");
			System.out.println("       7 to change year of vehicles");
			System.out.println("       8 to watch heigth (for planes)");
			System.out.println("       9 to change heigth (for planes)");
			System.out.println("       10 to watch number of passengers (for planes and ships)");
			System.out.println("       11 to change number of passengers (for planes and ships)");
			System.out.println("       12 to watch ports (for ships)");
			System.out.println("       13 to change ports (for ships)");
			System.out.println("       14 to watch Vehicle with max price");
			System.out.println("       15 to watch Vehicle with year 2000-2005, speed > 150km/h, lower price");
			System.out.println("       16 to watch from Vehicle array of cars which are not older then 5 years");
			System.out.println("       17 »Á Ã‡ÒË‚‡ Vehicle array of ships which are not older then 5 years, sorted descending");
			System.out.println("       -1 to exit");
			ind = sc.nextInt();
			switch(ind){
				case 1:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println(myVehicles.get(i).toString());
					}
					break;
				}
				case 2:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println(myVehicles.get(i).getCoordinates());
					}
					break;
				}
				case 3:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println("Change coordinate for " 
								+ myVehicles.get(i).toString() + "?");
						System.out.println("Write 1 to change or 2 continue");
						ind = sc.nextInt();
						if(ind == 1){
							System.out.println("Write new coordinates(latitude, longitude)");
							myVehicles.get(i).setCoordinates(new —oordinates(sc.nextDouble(),sc.nextDouble()));
						} 
					}
					break;
				}
				case 4:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println(myVehicles.get(i).getPrice());
					}
					break;
				}
				case 5:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println("Change price for " 
								+ myVehicles.get(i).toString() + "?");
						System.out.println("Write 1 to change or 2 continue");
						ind = sc.nextInt();
						if(ind == 1){
							System.out.println("Write new price");
							myVehicles.get(i).setPrice(sc.nextDouble());
						} 
					}
					break;
				}
				case 6:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println(myVehicles.get(i).getYear());
					}
					break;
				}
				case 7:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println("Change year for " 
								+ myVehicles.get(i).toString() + "?"); 
						System.out.println("Write 1 to change or 2 continue");
						ind = sc.nextInt();
						if(ind == 1){
							System.out.println("Write new year");
							myVehicles.get(i).setYear(sc.nextDouble());
						} 
					}
					break;
				}
				case 8:{
					for (int i = 0; i < myVehicles.size(); i++) {
						if(myVehicles.get(i) instanceof CPlane)
							System.out.println(((CPlane)myVehicles.get(i)).getHeight());
					}
					break;
				}
				case 9:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println("Change heigth for " 
								+ myVehicles.get(i).toString() + "?");
						System.out.println("Write 1 to change or 2 continue");
						ind = sc.nextInt();
						if(ind == 1){
							System.out.println("Write new heigth");
							((CPlane)myVehicles.get(i)).setHeight(sc.nextDouble());
						} 
					}
					break;
				}
				case 10:{
					for (int i = 0; i < myVehicles.size(); i++) {
						if(myVehicles.get(i) instanceof CShip)
							System.out.println(((CShip)myVehicles.get(i)).getPassengers());
						if(myVehicles.get(i) instanceof CPlane)
								System.out.println(((CPlane)myVehicles.get(i)).getPassengers());
					}
					break;
				}
				case 11:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println("Change number of passengers for " 
								+ myVehicles.get(i).toString() + "?");
						System.out.println("Write 1 to change or 2 continue");
						ind = sc.nextInt();
						if(ind == 1){
							System.out.println("Write new number of passengers");
							if(myVehicles.get(i) instanceof CShip)
								((CShip)myVehicles.get(i)).setPassengers(sc.nextDouble());
							if(myVehicles.get(i) instanceof CPlane)
								((CPlane)myVehicles.get(i)).setPassengers(sc.nextDouble());
						} 
					}
					break;
				}
				case 12:{
					for (int i = 0; i < myVehicles.size(); i++) {
						if(myVehicles.get(i) instanceof CShip)
							System.out.println(((CShip)myVehicles.get(i)).getPort());
					}
					break;
				}
				case 13:{
					for (int i = 0; i < myVehicles.size(); i++) {
						System.out.println("Change port for " 
								+ myVehicles.get(i).toString() + "?");
						System.out.println("Write 1 to change or 2 continue");
						ind = sc.nextInt();
						if(ind == 1){
							System.out.println("Write new port");
							((CShip)myVehicles.get(i)).setPort(sc.nextLine());
						} 
					}
					break;
				}
				case 14:{
					double max = 0;
					ArrayList<Integer> index = new ArrayList<Integer>();
					for (int i = 0; i < myVehicles.size(); i++) {						
						if(myVehicles.get(i).getPrice() > max){
							max = myVehicles.get(i).getPrice();
							index.clear();
							index.add(i);							
						}
						if(myVehicles.get(i).getPrice() == max){							
							index.add(i);
						}
					}
					for (int i = 0; i < index.size(); i++) {
						System.out.println(myVehicles.get(index.get(i)).toString());
					}					
					break;
				}
				case 15:{
					double min = 1000000000;
					ArrayList<Integer> index = new ArrayList<Integer>();
					for (int i = 0; i < myVehicles.size(); i++) {						
						if((myVehicles.get(i).getPrice() <= min)
							&&(myVehicles.get(i).getYear() >= 2000)
							&&(myVehicles.get(i).getYear() <= 2005)
							&&(myVehicles.get(i).getSpeed() >= 150)){
							if(myVehicles.get(i).getPrice() == min){							
								index.add(i);
							}
							else{
								min = myVehicles.get(i).getPrice();
								index.clear();
								index.add(i);
							}
							
						}
						
					}
					if (index.size() == 0){
						System.out.println("Not exists");
					} else {
						for (int i = 0; i < index.size(); i++) {
							System.out.println(myVehicles.get(index.get(i)).toString());
						}
					}
					break;
				}
				case 16:{
					ArrayList<CCar> cars = new ArrayList<CCar>();
					for (int i = 0; i < myVehicles.size(); i++) {
						if((myVehicles.get(i) instanceof CCar) 
							&& (myVehicles.get(i).getYear() + 5 >= CURRENT_YEAR  )){
							cars.add((CCar)myVehicles.get(i));
						}
					}
					for (int i = 0; i < cars.size(); i++) {
						System.out.println(cars.get(i).toString());
					}
						
					break;
				}
				case 17:{
					ArrayList<CShip> ship = new ArrayList<CShip>();
					for (int i = 0; i < myVehicles.size(); i++) {
						if((myVehicles.get(i) instanceof CShip) 
							&& (myVehicles.get(i).getYear() + 5 >= CURRENT_YEAR  )){
							ship.add((CShip)myVehicles.get(i));
						}
					}
					
					for (int i = 0; i < ship.size(); i++) {
						for (int j = 0; j < ship.size(); j++) {
							if(ship.get(i).getPrice() > ship.get(j).getPrice()){
								CShip temp = ship.get(i);						
								ship.set(i, ship.get(j));
								ship.set(j, temp);
							}
						}
					}					
					for (int i = 0; i < ship.size(); i++) {
						System.out.println(ship.get(i).toString());
					}
						
					break;
				}
				default:{
					System.out.println("Unknown value!");
				}
			}
			System.out.println();
		} while(ind != -1);
		sc.close();
	}

}
