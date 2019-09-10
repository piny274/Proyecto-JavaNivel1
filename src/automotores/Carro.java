/*
 * Paquete de automotores
 */
package automotores;

/**
 * Clase tipo Carro con sus atributos y sus métodos.
 *
 */
public class Carro {

    private String color;
    private int nroPuertas;
    private int modelo;
    private String marca;

    /**
     * Constructor de la clase Carro. Encargado de crear los objetos.
     *
     * @param color Color del carro
     * @param nroPuertas Número de puertas
     * @param modelo Modelo
     * @param marca Marca
     */
    public Carro(String color, int nroPuertas, int modelo, String marca) {
        this.color = color;
        this.nroPuertas = nroPuertas;
        this.modelo = modelo;
        this.marca = marca;

    }

    public void acelerar() {

    }

    public void frenar() {

    }

    /**
     * Función del valor del carro. Depende del modelo y número de puertas.
     *
     * @return Retorna decimal con el valor del carro.
     */
    public double valorCarro() {
        //Primera condicion
        if (this.modelo > 2010 && this.nroPuertas == 4) {
            return 50000000;
        }
        //Segunda condicion
        if (this.modelo > 2010 && this.nroPuertas == 2) {
            return 40000000;
        }
        if (this.modelo <= 2010 && this.nroPuertas == 4) {
            return 40000000;
        }
        if (this.modelo <= 2010 && this.nroPuertas == 2) {
            return 40000000;
        }
        return 1000000;
    }

    /*
    Procedimiento encargado de imprimir la información básica del carroÏ
     */
    public void imprimir() {
        System.out.println("El carro es de marca: " + this.marca);
        System.out.print(" de color " + this.color);
        System.out.print(" del modelo " + this.modelo);
        System.out.println("");
    }

}
