
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        /* ejercicio3
        se solicita calcular el area y el perimetro de un rectangulo, para esto
        debemos crear las variables 
        alto (int)
        ancho (int)
        el usuario debe proporcionar los valores de alto, ancho y despues de imprimir
        el resultado en el siguiente formato (recuerden no usar acentos, respétar los espacios
        mayusculas, minusculas y saltos de linea)
        le decimos al usuario:
        digite el alto del rectangulo
        digite el ancho del rectangulo
        formula: area = alto * ancho
        perimetro: (alto + ancho)*2
        ¿cual es el codigo del ejercicio planteado?*/
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite el alto del rectangulo");
        int alto = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el ancho del rectangulo");
        int ancho = Integer.parseInt(entrada.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        
        












    }

    }
    

