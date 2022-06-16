
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        //reutilizamos la variable
        miVariable = 5;
        System.out.println(miVariable);
        // tipo String 
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        //reutilizamos la variable
        miVariableCadena = "Sigamos Creciendo en Programacion";
        System.out.println(miVariableCadena);
        System.out.println("");*/
        // clase scanner
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("resultado: "+titulo2+ " "+usuario2);*/

        /* tipo primitivos en java
        tipos eneteros
        
    
        /*byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("valor minimo del byte:"+ Byte.MIN_VALUE);
        System.out.println("valor maximo del byte:"+ Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("valor minimo del short:"+ Short.MIN_VALUE);
        System.out.println("valor maximo del short:"+ Short.MAX_VALUE);
        
        int numEnteroint = 2147483647;
        System.out.println("numEnteroint = " + numEnteroint);
        System.out.println("valor minimo del int:"+ Integer.MIN_VALUE);
        System.out.println("valor maximo del int:"+ Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("valor minimo del Long:"+ Long.MIN_VALUE);
        System.out.println("valor maximo del Long:"+ Long.MAX_VALUE);*/
 /*
        //tipo flotantes
        //son con punto decimal
        float numFloat = 3.4028235E38F; //la literal es de tipo flotante 
        //por eso se le agraga la "F" tambien puede escribirse = (foat)10.0;
        System.out.println("numfloat = "+ numFloat);
        System.out.println("valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("valor maximo de float:"+ Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = "+ numDouble);
        System.out.println("numero minimo de double:"+ Double.MIN_VALUE);
        System.out.println("numero maximo de double:"+ Double.MAX_VALUE);*/
 /*
        //inferencia de tipos var y tipos primitivas
        var numEntero = 20; //las literales sin punto automaticamente 
        //son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; // automaticamente con el punto decimal se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
        //tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCAracter = '\u0024'; //indicamos a java el codigo unicode
        System.out.println("varCAracter = " + varCAracter);
        char varCaracterDecimal = 36; //valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
                
        var varCAracter1 = '\u0024'; //indicamos a java el codigo unicode
        System.out.println("varCAracter1 = " + varCAracter1);
        var varCaracterDecimal1 = (char)36; //valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';//nos muestra el valor decimal q corresponde a la lista de unicode
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        
        // tipos primitivos tipos booleanos
        
        boolean varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("la bandera es verde");
        }
        else{
            System.out.println("la bandera es roja");
        
        }
         */
//         algoritmo: es mayor de edad?
//        var edad = 15; //literal tener presente la interencia de tipos
//        var adulto = edad >= 18;
//        if (adulto){
//            System.out.println("eres mayor de edad");
//        }
//        else{
//            System.out.println("eres menor de edad");}
////        var edad = 18; //literal tener presente la interencia de tipos
////        var adulto = edad >= 18; exprecion booleana
//              
//        if (edad >= 18){
//            System.out.println("eres mayor de edad");
//        }
//        else{
//            System.out.println("eres menor de edad");}
/*          
          convercion de tipos primitivos
          var edad = Integer.parseInt("20"); // Integer.parseInt("20")nos permite cambiar el valor de una variable string a int
          System.out.println("edad = " + (edad +1));//hora dentro de los parentesis genera una suma
          var valorPI = Double.parseDouble("3.1416");
          System.out.println("valorPI = " + valorPI);
        
          var edad = "20"; 
          System.out.println("edad = " + (edad + 1));
          var valorPI = Double.parseDouble("3.1416");
          System.out.println("valorPI = " + valorPI);*/
        //pedir un valor
//        var edad = Integer.parseInt("20");
//        var entrada = new Scanner(System.in);
//        System.out.println("digite su edad:");
//        edad = Integer.parseInt( entrada.nextLine());
//        System.out.println("edad = " + edad);
//        
//        //convertir de tipo entero a tipo string
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        
//        var fraseChar = "programadores".charAt(12); //charAt(12) nos muestra la ubicacion de las letras dentro de la palabra "programadores"
//        System.out.println("fraseChar = " + fraseChar);
//        
//        System.out.println("digite un caracter: ");
//        fraseChar = entrada.nextLine().charAt(0);
//        System.out.println("fraseChar = " + fraseChar);*/
        /*
        //  operadores aritmetcos
          int num1 = 5, num2 = 4; //asi se inicializan varias variables al mismo tiempo. solo siendo numeros
          var solucion = num1 + num2;
          System.out.println("solucion de la suma = "+ solucion);
          
          solucion = num1 - num2;
          System.out.println("solucion de la resta = " + solucion);
          
          solucion = num1 * num2;
          System.out.println("solucion de la multiplicacion = " + solucion);
          
          solucion = num1 / num2;
          System.out.println("solucion de la division = " + solucion);
          
          var solucion2 = 3.4 / num2;//aca reconoce q ya esta el tipo double por el numero con coma
          System.out.println("resultado de la division = " + solucion2);
          
          solucion = num1 % num2; //guarda el reciduo entero de la division
          System.out.println("solucion = " + solucion); // 5/4 a 5 le resto 4 y el resultado es el reciduo
          
          if (num2 % 2 == 0)
              System.out.println("es un numero par");
          else
              System.out.println("el numero es impar");*/
 /*
          int varNum1 = 1, varNum2 = 4;
          int varNum3 = varNum1 + 6 - varNum2; // una operacion
          System.out.println("varNum3 = " + varNum3);
          
          varNum1 += 1; //varNum1 = varNum1 + 1; 
          System.out.println("varNum1 = " + varNum1);
          
          // -=  *=  /=  %=
          
          varNum1 -= 2;
          System.out.println("varNum2 = " + varNum2);
          
          varNum1 *= 5;
          System.out.println("varNum1 = " + varNum1);
                  
          varNum1 /= 4;
          System.out.println("varNum3 = " + varNum3);
          
          varNum1 %= 6;
          System.out.println("varNum1 = " + varNum1);
          
          // operadores unarios = cambio de signos
          var varA = 7;
          var varB = -varA;
          System.out.println("varA=" + varA);
          System.out.println("varB = " + varB); // la variable b sera de tipo negativo
          
          //operador de negacion
          var varC = true; //esta variable por defoult en java es de tipoboolean
          var varD = !varC;// aqui est invirtiendo el valor 
          System.out.println("varC = " + varC);
          System.out.println("varD = " + varD);
          
          //operadores unarios de incremento - preincremento
          var varE = 9;// se va a modificar su valor
          var varF = ++varE;// simbolo antes de la variable 
          //primero se incrementa la variable y despues se usa su valor
          System.out.println("varE = " + varE);//se incrementa en la unidad
          System.out.println("varF = " + varF);//va a sumar uno
          
          //postincremento (el simbolo va despues de la variable), luego el incremento
          var varG = 3;
          var varH = varG++;//primero el valor el valor de la variable luego el incremento
          System.out.println("varG = " + varG);
          System.out.println("varH = " + varH);
          
          //operadores de decremento
          var varI = 4;
          var varJ = --varI;//la variable ya esta en decremento
          System.out.println("varI = " + varI);
          System.out.println("varJ = " + varJ);
          
          //postdecremento
          var varK = 8;
          var varL = varK--;//primero el valor el valor de la variable luego el del decremento
          System.out.println("varK = " + varK);// aqui va el decremento en 1
          System.out.println("varL = " + varL);
        //operadores de igualdad y relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;//los parentesis son opcionales
        System.out.println("dNum = " + dNum);

        var cadenaA = "hola";
        var cadenaB = "adios";
        var cVar = cadenaA == cadenaB;//== no compara la variable de la cadena pero si sus referencias de objetos
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        //operadores relacionales
        var gVar = aNum > bNum;//> < >= <= == !=(diferente)
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");

        }
        var edad = 15;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
        
        // operador condicional AND
         var valorA = 7;
         var valorMinimo = 0;//rango de 0 a 10
         var valorMaximo = 10;
         var respuesta = valorA >= 0 && valorA <= 10;//>= <= incluye el 0 y el 10
         // && (and) si una variable es verdadero el otro tambien es verdadero
         if (respuesta)
             System.out.println("esta dentro de rango");
         else
             System.out.println("esta fuera del rango");
         
        //operador OR
        var vacaciones = false;//or si uno es verdadero y el otro falso o viceversa da un verdadero
        var diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("papa puede asistir");
        else 
            System.out.println("no puede aiatir");
        
        //operador ternario
        
        //segun la primera condicion te da un resultado y segun la segunda condicion da otro resultado
        var resultadoT = (5 > 8) ? "verdadero" : "falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0)? "Par" : "Impar";
        System.out.println("resultadoT = " + resultadoT);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;//si x vale 5 va a pasar a valer 6 y si y vale 10 pasa a valer 9
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + (5 * 6) / 3 = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3;//4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        */
       
        
        
           
 
 
  
                
        
        
 
 
 
    }

}
