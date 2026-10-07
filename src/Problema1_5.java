/* PROBLEMA 1.5
* Contruya un diagrama de flujo tal que dado como datos el radio y
* la altura de un cilindro, calcule e imprima el area y su volumen.
*
* */


/* CONSIDERACIONES
* Volumen = pi * radio^2 * altura
* Area = 2 * pi * radio * altura
* pi = 3.1416
* */


public class Problema1_5 {
    private static double PI = 3.1416;

    public static void main(String[] args) { // INICIO
        double radio = 20;
        double altura = 16;

        double volumen = PI * Math.pow(radio, 2) * altura;
        double area = 2 * PI * radio * altura;

        System.out.println("El volumen del cilindro es " + String.format("%.2f", volumen));
        System.out.println("El area del cilindro es " + String.format("%.2f", area));
    } //FIN
}
