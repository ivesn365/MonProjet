package ivess;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double monTab[][] = {{12, 63, 7, 10, 19, 9, 13, 4}, {1, 324, 789, 5.5, 19, 0.98, 1.3, 4.7}};
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez taper une indice : ");
		int str = sc.nextInt();
		System.out.println("Veuillez taper un nombre : ");
		int s = sc.nextInt();
		Remplacement(str, s);
		/*while( i < 2) {
			j = 0;
			while(j < 8) {
				if(monTab[i][j] == str) {
					//System.out.println("True");
					break;
				}
					
				
				else {
					System.out.println("-1");
					break;					
				}
					
			}
			System.out.println("");
			i++;
		}*/
	}
	
	public static void Remplacement(int i, int j) {
		double monTab[][] = {{12, 63, 7, 10, 19, 9, 13, 4}, {1, 324, 789, 5.5, 19, 0.98, 1.3, 4.7}};
		monTab[0][i] = j;
		int k = 0;
		int y = 0;
		while( k < 2) {
			while(y < 8) {
				System.out.println(monTab[k][y]);
				y++;
			}
			k++;
			
		}
		
		
	}

}
