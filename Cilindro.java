public class Cilindro {
    public static void main (String[] args){
        //Ejercicio 2
        int radio = 10;
        int altura = 20;
        double volumen = 3.1416*altura*radio*radio;
        double area = 2*3.1416*altura*radio + 2*3.1416*radio*radio;

       System.out.println("***Área y volumen de un cilindro***");
       System.out.println("El área del cilindro es: "+ area + " cm²");
       System.out.println("El volumen del cilindro es: "+ volumen + " cm³");

    }
}