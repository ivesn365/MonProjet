package ivess;

import java.util.Scanner;

import java.util.List;

import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 triTab();
		//rechercheNombre();
		//Remplacement();
		/*int i = moyenTab();
		System.out.println(i);*/
		
		
 
		
	}
	/*permet à l’utilisateur de saisir un chiffre au clavier que le programme recherche 
	 * s’il existe dans le tableau et renvoie sa/ses positions. 
	 * Renvoie -1,si l’élément n’est pas trouvé 
	 * */
	 public static void rechercheNombre() {
	
		    double monTab[][] = {{12, 63, 7, 10, 19, 9, 13, 4}, {1, 324, 789, 5.5, 19, 0.98, 1.3, 4.7}};
			int i = 0;
			int j = 0;
		    Scanner sc = new Scanner(System.in);
			
			System.out.println("Veuillez taper un nombre : ");
			int s = sc.nextInt();
			
			while( i < 2) {
				j = 0;
				while(j < monTab.length) {
					if(monTab[i][j] == s) { 
						System.out.println("Sa position est : "+j);
					}
					else{ 
						System.out.println("-1"); 
					    break;
					}
					j++;
						
				}
				
				i++;
			}
		  
	  }
	 /*permet à l’utilisateur de saisir l’élément et un indice. 
	  * Le programme place l’élément saisit à l’indice indiqué en écrasant l’élément 
	  * qui s’y trouvait
	   */
	
	public static void Remplacement() {
		Scanner sc = new Scanner(System.in);
		double monTab[][] = {{12, 63, 7, 10, 19, 9, 13, 4}, {1, 324, 789, 5.5, 19, 0.98, 1.3, 4.7}};
		System.out.println("Veuillez taper la position de l'élément : ");
		int i = sc.nextInt();
		System.out.println("Veuillez taper  l'élément : ");
		int j = sc.nextInt();
		monTab[0][i] = j;
		int k = 0;
		int y = 0;
		while( k < 2) {
			y = 0;
			while(y < 8) {
				System.out.println(monTab[k][y]);
				y++;
			}
			k++;
			
		}
		
		
	}
	/*permet à l’utilisateur de saisir la taille et les éléments d’un tableau. 
	 * Calculez la moyenne et la somme totale des éléments saisis
	 * */
  public static int moyenTab() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Veuillez taper la taille du tableau : ");
	  int taille_tab = sc.nextInt();
	  int tableau[] = new int[taille_tab];
	  int i = 0, som = 0, moy = 0;
	  
	  while(i < tableau.length) {
		  System.out.println("Veuillez taper les contenues du tableau : ");
		  int element = sc.nextInt();
		  tableau[i] = element;
		  som += tableau[i]; 
		  i++;
	  }
	  moy = som/i;
	  return moy;
	  
	  
  }
  
  public static void triTab() {
	  Scanner sc = new Scanner(System.in); 
	  System.out.println("Veuillez taper la taille du tableau : ");
	  int taille_tab = sc.nextInt();
	  int tableau[] = new int[taille_tab];
	  int i = 0;
	  
	  while(i < tableau.length) {
		  System.out.println("Veuillez taper les contenues du tableau : ");
		  int element = sc.nextInt();
		  tableau[i] = element;
		  i++;
	  }
	  //afficherElementTableau(tableau);
	  char car = ' ';
	  String lettre;
	  System.out.println("Veuillez entrer une lettre pour trier croissant ou decroissant(d/c) : ");
	  lettre = sc.nextLine();
	  car = lettre.charAt(0);
	  if(car == 'c') {
		  int tempo, j, k = 0;
		  while(k < tableau.length) {
			  tempo = tableau[k];
			  j = k - 1;
			  while(j >= 0 && tableau[j] > tempo) {
				  tableau[j+1] = tableau[j];
				  j -= 1;
				  tableau[j+1] = tempo;
				  j++;
			  }
			  k++;
			
		  }
		  afficherElementTableau(tableau);
		  
	  }
	  
	  else if(car == 'd') {
		  int tempo, j, k = 0;
		  while(k < tableau.length) {
			  tempo = tableau[k];
			  j = k - 1;
			  while(j >= 0 && tableau[j] < tempo) {
				  tableau[j+1] = tableau[j];
				  j -= 1;
				  tableau[j+1] = tempo;
				  j++;
			  }
			  k++;
			
		  }
		  afficherElementTableau(tableau);
		  
	  }
	  
	  
  }
  
 public static void afficherElementTableau(int[] tableau) {
	 int i = 0;
	 while(i < tableau.length) {
		 System.out.print(tableau[i]);
		 i++;
	 }
 }
  
  

}
