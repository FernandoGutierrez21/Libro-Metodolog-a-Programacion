/* PROBLEMA 1.6
* Construya un diagrama de flujo que calculo e imprima el numero de segundos que
* hay en un determinado numero de dias.
*
* */


/* CONSIDERACIONES
* Para 1 dia hay 24 horas
* Para 1 hora hay 60 min
* Para 1 min hay 60 segundos
*
* */


public class Problema1_6 {
    public static void main(String[] args) { // INICIO
        // Obtenemos el numero de dias a convertir
        int dias = 7;

        // Hay que hacer una con version de dias a segundos
        int segundos = dias * 24 * 60 * 60;

        // imprimir los segundos
        System.out.println("En " + dias + " dias hay " + segundos + " segundos.");

    } // FIN
}
