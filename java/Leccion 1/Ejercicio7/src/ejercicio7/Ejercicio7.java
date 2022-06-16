
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        una compañia de venta de carros usados, paga a su personal de ventas de 
        $1000 mensuales mas una comision de $150 por cada carro vendido, mas el 
        5% del valor de la venta por carro. cada mes el capturista de la empresa
        ingresa en la computadora los datos pertinentes
        hacer un programa q calcule e imprima el salario mensual de un vendedor 
        dado
        el salario de 1000 lo vamos a manejar como un dato constante, 
        para asignarlo debemos usar la palabra reservada "final"
        */
        final int salarioConstante = 1000;
        System.out.println("digite la cantidad de vehiculos vendidos: ");
        int autosVendidos = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el precio: ");
        float precioAuto = Integer.parseInt(entrada.nextLine());
        float totalAutosVendidos = autosVendidos * precioAuto;
        var salarioEmpleado = salarioConstante + (autosVendidos * 150) + (totalAutosVendidos * 0.05);
        System.out.println("Salario mensual del vendedor: "+ salarioEmpleado);
                
        
        
        
        
        
        
        
    }
    
}
