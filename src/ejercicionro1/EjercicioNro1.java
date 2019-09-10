/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionro1;

import automotores.Carro;
import java.util.*;

/**
 * Clase tipo EjercicioNro1.
 *
 * TIPOS DE DATOS
 *
 * int : Declarar número enteros. double: Declarar números decimales (Permite
 * enteros). String: Declarar textos
 */
public class EjercicioNro1 {

    /**
     * Procedimiento por donde inicia la ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * **************************PARTE UNO***************************
         */
        // Llamado al procedimiento de imprimir nombre 
        imprimirNombre();

        //Ingreso de información por teclado 
        Scanner miScanner = new Scanner(System.in);

        //Capturando el numero uno 
        System.out.print("Ingrese el número uno para realizar las operaciones: ");
        double numeroUno
                = miScanner.nextDouble();

        //Capturando el número dos 
        System.out.print("Ingrese el número dos para realizar las operaciones: ");
        double numeroDos
                = miScanner.nextDouble();

        System.out.println("El número uno ingresado es: " + numeroUno);
        System.out.println("El número dos ingresado es: " + numeroDos);

        //LLamar la función sumar e imprimir el resultado 
        double resultadoSuma = sumarNumeros(numeroUno, numeroDos);
        imprimirResultado(resultadoSuma, "SUMA");

        //LLamar la función restar e imprimir el resultado 
        double resultadoResta = restar(numeroUno, numeroDos);
        imprimirResultado(resultadoResta, "RESTA");

        //LLamar la función multiplicar e imprimir el resultado 
        double resultadoMultiplicacion = multiplicar(numeroUno, numeroDos);
        imprimirResultado(resultadoMultiplicacion, "MULTIPLICACION");

        //LLamar la función dividir e imprimir el resultado 
        double resultadoDivision = dividir(numeroUno, numeroDos);
        imprimirResultado(resultadoDivision, "DIVISION");

        //****************************PARTE DOS ****************************
       // Creación del primer objeto llamado miPrimerCarro
        Carro miPrimerCarro = new Carro("AZUL", 4, 2000, "KIA");
               // Creación del segundo objeto llamado miSegundoCarro

        Carro miSegundoCarro = new Carro("NERGO", 2, 2016, "CHEVROLET");

        //Imprimir el valor y la información del primer carro
        double valorPrimerCarro = miPrimerCarro.valorCarro();
        System.out.println(" El valor del primer carro es: " + valorPrimerCarro);
        miPrimerCarro.imprimir();

        //Imprimir el valor y la información del segundo carro
        double valorSegundoCarro = miSegundoCarro.valorCarro();
        System.out.println(" El valor del segundo carro es: " + valorSegundoCarro);
        miSegundoCarro.imprimir();
        
        //Ingresando un nuevo commit
        System.out.println("Imgresando nuevo 3Commit");
    }

    /**
     * Procedimiento para imprimir un nombre
     */
    private static void imprimirNombre() {
        // Comando para imprimir en consola
        System.out.println("Mi nombre es Cristian Tabares ");
    }

    /**
     * Función para sumar dos números
     *
     * @param numeroUno Primero número para sumar
     * @param numeroDos Segundo número para sumar
     * @return La suma de numeroUno y numeroDos
     */
    private static double sumarNumeros(double numeroUno, double numeroDos) {

        double resultadoSuma = numeroUno + numeroDos;
        return resultadoSuma;
    }

    /**
     *
     * @param numeroUno
     * @param numeroDos
     * @return
     */
    private static double restar(double numeroUno, double numeroDos) {
        double resultadoResta = numeroUno - numeroDos;
        return resultadoResta;
    }

    /**
     *
     * @param numeroUno
     * @param numeroDos
     * @return
     */
    private static double multiplicar(double numeroUno, double numeroDos) {

        double resultadoMultiplicacion = numeroUno * numeroDos;
        return resultadoMultiplicacion;
    }

    /**
     *
     * @param numeroUno
     * @param numeroDos
     * @return
     */
    private static double dividir(double numeroUno, double numeroDos) {

        double resultadoDivision = numeroUno / numeroDos;
        return resultadoDivision;
    }

    /**
     * Procedimiento para imprimir un resultado de un tipo
     * @param resultado Decimal con el resultado
     * @param tipoOperacion Tipo de operación que se esta imprimiendo.
     */
    private static void imprimirResultado(double resultado, String tipoOperacion) {
        System.out.println("La operación realiazada es: " + tipoOperacion);
        System.out.println("El resultado es: " + resultado);
    }

}
