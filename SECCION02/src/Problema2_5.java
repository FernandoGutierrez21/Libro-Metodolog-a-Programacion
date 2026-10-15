/* PROBLEMA 2.5
* Construya un diagrama de flujo tal que dado como dato un numero
* entero, determine e imprima si el mismo es positivo, negativo o
* nulo
*
* */


public class Problema2_5 {
    public static void main(String[] args) { // INICIO
        double numero = 0;

        if (numero > 0) {
            System.out.println("POSITIVO");
        } else if(numero == 0) {
            System.out.println("NULO");
        } else {
            System.out.println("NEGATIVO");
        }

    } // FIN
}
