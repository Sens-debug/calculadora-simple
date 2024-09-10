package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // PASO2
        double numero1, numero2, resultado;
        String operacion;

        // PASO 3
        Scanner teclado = new Scanner(System.in);
        System.out.println("---ingrese el primer numero a calcular---");
        numero1 = teclado.nextDouble();
        System.out.println("---ingrese el segundo numero a calcular---");
        numero2 = teclado.nextDouble();
        System.out.println("----AHORA INGRESE LA OPERACION QUE QUIERA REALIZAR-----");
        System.out.println("--- + SUMA ---");
        System.out.println("--- - RESTA ---");
        System.out.println("--- * MULTIPLICACION---");
        System.out.println("--- / DIVISION ---");
        System.out.println("--- % MODULO ---");

        Scanner input = new Scanner(System.in);
        operacion = input.nextLine();
        // operacion = input.next().charAt(0);

        resultado = 0;
        // PASO 4
        if (operacion.equalsIgnoreCase("+"))
        {
            resultado = (numero1 + numero2);
        };

        if (operacion.equalsIgnoreCase("-"))
            
        {
            resultado = (numero1 - numero2);

        };
        if (operacion.equalsIgnoreCase("*"))
            
        {
            resultado = numero1 * numero2;
            
        };
        if (operacion.equalsIgnoreCase("/"))
            
        {
            resultado = numero1 / numero2;

        };
        if (operacion.equalsIgnoreCase("%"))
            
        {
            resultado = numero1 % numero2;
        };

        // //PASO 5
        System.out.println("---EL VALOR DE LA OPERACION ASIGNADA ES --- " + resultado);

        // PASO 6
        System.out.println("---A CONTINUACION VAMOS A COMPARAR LOS 2 NUMEROS PREVIAMENTE INGRESADOS---");
        if (numero1 > numero2) {
            System.out.println(numero1 + " Es mayor que " + numero2);
        }
        if (numero1 < numero2) {
            System.out.println(numero2 + " Es mayor que " + numero1);
        }
        if (numero1 == numero2) {
            System.out.println(numero1 + " Y " + numero2 + " Son iguales");
        }

        // PASO 7
        if (resultado % 2 == 0) {
            System.out.println("---EL RESULTADO DE LA OPERACION ES NUMERO PAR");
        } else {
            System.out.println(resultado + " ES NUMERO IMPAR");
        }

        // PASO 8
        int resultadoEntero = (int) resultado;
        System.out.println("--LA VARIABLE resultadoEntero contiene el valor ---> " + resultadoEntero);

        // PASO 9
        if (numero1 > 10 && numero2 > 10)
            System.out.println("--AMBOS NUMERO SON POSITIVOS MAYORES QUE 10");
        {
        }
        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("--AL MENOS UNO DE LOS DOS NUMERO ES MENOR O IGUAL A 0");
        }
        teclado.close();

        // PASO 10

        input.close();
        teclado.close();
    }
}