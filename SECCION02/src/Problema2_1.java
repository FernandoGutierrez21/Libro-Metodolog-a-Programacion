/* PROBLEMA 2.1
* El numero de sonidos emitidos por un grillo en un minuto,
* es una funcion de la temperatura. Como resultado de esto,
* es posible determinar el nivel de temperatura haciendo uso
* de un grillo como termometro
* */

/* CONSIDERACIONES
* Formunla para la funcion = T = N / 4 + 40
* Donde T representa la temperatura en grados Fahrenheit y N
* el numero de sonidos emitidos por minuto del grillo
* */

public class Problema2_1 {
    public static void main(String[] args) { // INICIO
        // Recibiendo los datos
        int nSonidos = 20;

        if (nSonidos > 0){
            double temperatura = nSonidos / 4 + 40;

            // Impresion de datos
            System.out.println("La temperatura es " + temperatura);
        }

    } // FIN
}
