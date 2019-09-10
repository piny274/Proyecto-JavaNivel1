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
        // TODO code application logic here
        
       // puntoUnoFor();
        //puntoDosFor();
        //numerosParesFor();
        //sumaNumeros();
        imprimirAsteriscos();
    }
    
    /**
     * PUNTO 1
     * Este arreglo muestra los números del 1 al 100 con FOR
     */
    public static void puntoUnoFor(){
    
        for (int i = 0; i < 100 ; i++) {
            
            System.out.println("Numero: " + (i+1));
            
        }
    }
    
    /**
     * PUNTO 2 
     * Este arreglo muestra los números del 100 al 1 con FOR
     * 
     */
    public static void puntoDosFor(){
    
        
        for (int i = 100; i > 0; i--) {
            
            System.out.println("Numero: " + (i));
            
        }
    }
    
    /**
     * PUNTO 3
     * Este arreglo muestra los números pares del 1 al 150 con FOR
     */
    public static void numerosParesFor(){
    
        for (int i = 1; i < 150; i++) {
            
            int resuntado = i % 2;
            
            if (resuntado == 0){
            
                System.out.println(i);
            }
 
        }
    }
    
    /**
     * PUNTO 4 con FOR
     * Este arreglo muestra la suma de los numeros del 1 al 200 con FOR
     */
    public static void sumaNumeros(){
    
        int suma=0;
        for (int i = 0; i <= 200; i++) {
            
           suma = suma + i;
                      
        }
        System.out.println("El Rsultado de la suma es= " + suma);
    }
    
    /**
     * PUNTO 5
     * Este arreglo pide un numero y pone la cantidad ingresada en asteriscos con FOR
     */
    public static void imprimirAsteriscos(){
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        String numero = scanner.nextLine();
        System.out.print("El numero ingresado es: " + numero);
        System.out.println();
        int numeroEntero=Integer.parseInt(numero);
        
        for (int i = 1 ; i <= numeroEntero; i++) {
            
            System.out.print("*"); 
        }
              System.out.println();
    }
    
    
    public static void matriz(){
    
        int[][] miMatriz = new int[10][10];
        miMatriz[2][2]=6;
        miMatriz[3][3]=4;
        
        for (int fila = 0; fila < 10; fila++) {
            
            for (int columna = 0; columna < 10; columna++) {
                if( 4 % 2 ==0){
                }
                
                System.out.print(miMatriz[fila][columna]);
            }
            System.out.println();
        }
    }
    
}
