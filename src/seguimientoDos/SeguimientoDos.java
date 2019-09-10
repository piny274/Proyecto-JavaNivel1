/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientoDos;

import java.util.Scanner;

/**
 *
 * @author s109e12
 */
public class SeguimientoDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Punto 1
        puntoUnoFor();
        puntoUnoWhile();
        
        //Punto 2
        puntoDosFor();
        puntoDosWhile();
        
        //Punto 3
        numerosParesFor();
        numerosParesWhile();
        
        //Punto 4
        sumaNumerosFor();
        sumaNumerosWhile();
        
        //Punto 5
        imprimirAsteriscosFor();
        imprimirAsteriscosWhile();
        
        //Punto 6
        matrizFor();
        matrizWhile();
    }

    /**
     * PUNTO 1 Este arreglo muestra los números del 1 al 100 con FOR
     */
    public static void puntoUnoFor() {

        for (int i = 0; i < 100; i++) {

            System.out.println("Numero: " + (i + 1));

        }
    }

    /**
     * PUNTO 1 Este arreglo muestra los números del 1 al 100 con WHILE
     */
    public static void puntoUnoWhile() {
        int i = 0;

        while (i < 100) {

            i = i + 1;
            System.out.println(i);
        }
    }

    /**
     * PUNTO 2 Este arreglo muestra los números del 100 al 1 con FOR
     *
     */
    public static void puntoDosFor() {

        for (int i = 100; i > 0; i--) {

            System.out.println("Numero: " + (i));

        }
    }

    /**
     * PUNTO 2 Este arreglo muestra los números del 100 al 1 con WHILE
     *
     */
    public static void puntoDosWhile() {
        int i = 101;
        while (i > 1) {
            i = i - 1;
            System.out.println(i);
        }
    }

    /**
     * PUNTO 3 Este arreglo muestra los números pares del 1 al 150 con FOR
     */
    public static void numerosParesFor() {

        for (int i = 1; i <= 150; i++) {

            int resuntado = i % 2;

            if (resuntado == 0) {

                System.out.println(i);
            }

        }
    }

    /**
     * PUNTO 3 Este arreglo muestra los números pares del 1 al 150 con WHILE
     */
    public static void numerosParesWhile() {
        int i = 1;
        while (i <= 150) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i = i + 1;
        }
    }

    /**
     * PUNTO 4 con FOR Este arreglo muestra la suma de los numeros del 1 al 200
     * con FOR
     */
    public static void sumaNumerosFor() {

        int suma = 0;
        for (int i = 0; i <= 200; i++) {

            suma = suma + i;

        }
        System.out.println("El Resultado de la suma es= " + suma);
    }

    /**
     * PUNTO 4 con FOR Este arreglo muestra la suma de los numeros del 1 al 200
     * con WHILE
     */
    private static void sumaNumerosWhile() {
        int i = 0;
        int suma = 0;
        while (i <= 200) {
            suma = suma + i;
            i = i + 1;
        }
        System.out.println("El Resultado de la suma es= " + suma);
    }

    /**
     * PUNTO 5 Este arreglo pide un numero y pone la cantidad ingresada en
     * asteriscos con FOR
     */
    public static void imprimirAsteriscosFor() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        String numero = scanner.nextLine();
        System.out.print("El numero ingresado es: " + numero);
        System.out.println();
        int numeroEntero = Integer.parseInt(numero);

        for (int i = 1; i <= numeroEntero; i++) {

            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * PUNTO 5 Este arreglo pide un numero y pone la cantidad ingresada en
     * asteriscos con WHILE
     */
    private static void imprimirAsteriscosWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número:  ");
        int numero = scanner.nextInt();
        System.out.print("El número ingresado es: " + numero);
        System.out.println("");
        int i = 1;
        while (i <= numero) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

    }

    /**
     * PUNTO 6 Mostrar una matriz de 10 * 10 donde los números pares tienen una
     * X y los impares un 0
     *
     */
    public static void matrizFor() {

        int[][] miMatriz = new int[10][10];
        miMatriz[0][0] = 3;
        miMatriz[3][3] = 8;
        miMatriz[9][9] = 97;

        for (int fila = 0; fila < 10; fila++) {

            for (int columna = 0; columna < 10; columna++) {

                if (miMatriz[fila][columna] % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
                //System.out.print(miMatriz[fila][columna]);
            }
            System.out.println();
        }
    }
    
    /**
     * PUNTO 6 Mostrar una matriz de 10 * 10 donde los números pares tienen una
     * X y los impares un 0 con WHILE
     *
     */
    private static void matrizWhile() {
        int[][] miMatrizWhile = new int[10][10];
        miMatrizWhile[0][0] = 3;
        miMatrizWhile[3][3] = 8;
        miMatrizWhile[9][9] = 97;

        int fila = 0;
        int columna = 0;
        while (fila < 10) {
            while (columna < 10) {
               if (miMatrizWhile[fila][columna] % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
               columna++;
            }
            columna = 0;
            fila++;
            System.out.println();
        }
        System.out.println();
    }

}
