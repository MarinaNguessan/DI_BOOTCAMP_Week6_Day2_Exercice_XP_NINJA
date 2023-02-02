package atos;

public class Exercice2 {
   public static int  solutions(int a, int b, int c) {
        
        // Calcul du discriminant
    
        int discriminant = b * b - 4 * a * c;
        
        // Si le discriminant est négatif, l'équation n'a pas de solutions réelles
        
        if (discriminant < 0) {
        
            return 0;
        }
        
        // Si le discriminant est égal à 0, l'équation a une solution réelle
        
        if (discriminant == 0) {
            
            return 1;
        }
        // Si le discriminant est positif, l'équation a deux solutions réelles
        
        return 2;
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
