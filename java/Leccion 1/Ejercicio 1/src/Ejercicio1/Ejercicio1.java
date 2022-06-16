package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Digite el nombre del libro: ");
        String libro = entrada.nextLine();        
        System.out.println("Escriba el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precio = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme q el precio es gratuito");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(libro+ " #"+idLibro);
        System.out.println("precio del libro: $"+ precio);
        System.out.println("El envio es gratis: "+ envioGratuito);
        
        
    }
}
        
        
        
        
                            
        
        
        
               
        
//if (edad >= 18){
//            System.out.println("eres mayor de edad");
//        }
//        else{
//            System.out.println("eres menor de edad");        
//        
        
        
        
//        # tienda de libros
//libro = input("proporciona el nombre del libro: ")
//ID = input("proporcione el ID del libro: ")
//precio = int(input("digite el precio: "))
//envioGratuito = precio >= 0 and precio <= 500
//
//if envioGratuito:
//    print("el envio es gratis")
//else:
//    print("el envio NO es gratis supera los $500")
    
