
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
         /* el mayor de 2 numeros
        usaremos el operador ternario
        le vamos a pedir los numeros al usuario
        */
        Scanner entrada = new Scanner (System.in);
        System.out.print("digite un numero: ");
        int num1 = Integer.parseInt(entrada.nextLine());
        System.out.print("digite otro numero: ");
        int num2 = Integer.parseInt(entrada.nextLine());        
        System.out.print("el numero mayor es: ");
        System.out.print(num1 > num2 ? num1 : num2);
        System.out.println("");//salto de linea
  
        
        
  
    }
    
}
