
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        gillermo tiene N dolares. luis tiene la mitad de lo q posee guillermo
        juan tiene la mitad de lo q posee luis y guillermo juntos 
        hecer un programa q calcule e imprima la cantidad de dinero
        q tienen entre los 3        
        */
        System.out.print("dolares de Gillermo: $");
        int Guillermo = Integer.parseInt(entrada.nextLine());
        double Luis = Guillermo /2;
        double Juan = (Luis + Guillermo)/2;
        double suma = Luis + Juan + Guillermo;
        System.out.println("Luis tiene: $"+ Luis);
        System.out.println("Juan tiene: $"+ Juan);
        System.out.println("entre los 3 tienen $"+ suma);
        
     
        
        
    }
    
}
