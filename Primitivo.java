/**
 * Clase Primitivo Clase para mostrar el número de bytes utilizados por los
 * datos primitivos
 * 
 * @author Melissa Fernández
 * @version 1.0
 */

public class Primitivo {
    /**
     * Método principal donde se utiliza el método BYTES para imprimir el tamaño en
     * bytes de los tipos primitivos.
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("***Tipos primitivos***"); // Indicar de qué trata el programa
        // Imprimir el número de bytes de cada tipo primitivo
        System.out.println("byte: " + Byte.BYTES + " byte");
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
        System.out.println("boolean: 1 byte");
        System.out.println("char: " + Character.BYTES + " bytes");
    }
}