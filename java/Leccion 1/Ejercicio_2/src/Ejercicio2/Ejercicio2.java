package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // hacer un programa q calcule e imprima el salario de un empleado, 
        // a partir de sus horas semanales trabajadas y de su salario por hora

        Scanner entrada = new Scanner(System.in);
        int horasSemanales;
        float salarioHora, salarioTotal;

        System.out.println("digite las horas semanales: ");
        horasSemanales = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el salario q cobra por hora: ");
        salarioHora = Float.parseFloat(entrada.nextLine());

        salarioTotal = horasSemanales * salarioHora;
        System.out.println("el salario semanal en dolares es: " + salarioTotal);

        
        
    }

}
