/* PROBLEMA 1.8
* Construya un diagrama de flujo que calcule la distancia entre dos puntos, dado
* como datos las coordenadas de los puntos P1 y P2.
*
* */

/* CONSIDERACIONES
* La fórmula para calcular la distancia entre dos puntos es la siguiente
* Distancia = Raiz cuadrada ((X1 - X2) al cuadrado + (Y1 - Y2) al cuadrado)
*
* Ecplicacion de variables:
* X1: x del primer punto en el plano cartesiano.
* X2: x del segundo punto en el plano cartesiano.
* Y1: y del primer punto en el plano cartesiano.
* Y2: y del segundo punto en el plano cartesiano.
* */


public class Problema1_8 {
    public static void main(String[] args) {
        // Recibimos la ubicacion de los dos punto
        // En este ejemplo vamos a usar los siguientes dos puntos
        // P1(4, 7), P2(2,9)
        double x1 = 4;
        double y1 = 7;
        double x2 = 2;
        double y2 = 9;

        // hacemos el calculo de la distancia con la formula que tenemos
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // imprimimos el resultado
        System.out.println("La distancia entre los dos puntos es " + distancia);
    }
}
