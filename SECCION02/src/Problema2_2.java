/* PROBLEMA 2.2
* Construya un diagrama de flujo tal que dado como datos los valores
* enteros P y Q, determine si los mismos satisfacen la siguiente expresión.
*
* (P)**4 + (Q)**4 - 2*(P)**2 < 680
*
* En caso afirmativo debe imprimir los valores de P y Q
*
* */



public class Problema2_2 {
    public static void main(String[] args) { // INICIO
        double p = 3;
        double q = 5;

        double resultado = Math.pow(p, 3) + Math.pow(q, 4) - 2 * Math.pow(p, 2);

        if (resultado < 680) {
            System.out.println("Los valores respectivos de p y q son: " + p + ", " + q);
        }

    } // FIN
}
