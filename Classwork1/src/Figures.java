
public class Figures {

	static void rectangle(int a, int b){
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				if((i == 0) || (i == a) || (j == 0) || (j == b)){
					System.out.print("* ");
				}
				else {					
					System.out.print("  ");									
				}
			}
			System.out.println();
		}
	}
	
	static void rectTriangle(int a, int b){
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				if((j == 0) || (i == a) || (i == j)){
					System.out.print("* ");
				}
				else {					
						System.out.print("  ");									
				}
			}
			System.out.println();
		}
	}
	
	static void triangle(int a, int b){
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				if((i == a) || (j == b / 2 - i) || (j == b / 2 + i)){
					System.out.print("* ");
				}
				else {					
						System.out.print("  ");									
				}
			}
			System.out.println();
		}
	}
	
	static void romb(int a, int b){
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				if((((j == b / 2 - i) || (j == b / 2 + i)) && (i < a / 2 ))
				  || (((j == i - b / 2) || (j == b + b / 2 - i)) && (i >= a / 2 )))
					{
					System.out.print("* ");
				}
				else {					
						System.out.print("  ");									
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		rectangle(4,5);
		rectTriangle(6,6);
		triangle(3, 6);
		romb(6, 6);
	}
}
