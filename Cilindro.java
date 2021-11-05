/**
 * Clase Cilindro Clase para calcular el área y volumen del cilindro de radio 10
 * cm y altura 20 cm.
 * 
 * @author Melissa Fernández
 * @version 1.0
 */

public class Cilindro {
    /**
     * Método principal donde se calcula el volumen y área del cilindro
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {
        // Ejercicio 2

        // El radio del cilindro
        int radio = 10;
        // La altura del cilindro
        int altura = 20;

        // Calcular el volumen del cilindro usando su altura y su radio.
        double volumen = 3.1416 * altura * radio * radio;
        // Calcular el área del cilindro usando su altura y radio.
        double area = 2 * 3.1416 * altura * radio + 2 * 3.1416 * radio * radio;

        System.out.println("***Área y volumen de un cilindro***");// Imprimir qué se está calculando
        // Imprimir el área del cilindro
        System.out.println("El área del cilindro es: " + area + " cm²");
        // Imprimir el volumen del cilindro
        System.out.println("El volumen del cilindro es: " + volumen + " cm³");

    }
}