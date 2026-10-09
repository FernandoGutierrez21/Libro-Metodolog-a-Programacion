/* PROBLEMA 1.4
* Construya un diagrama de flujo que resuelva el problema que tienen en un gasolinera
* Los surtidores de la misma registran lo que "surten" en galones, pero el precio
* de la gasolina esta fijado en litros. El diagrama de flujo debe calcular e imprimir
* lo que hay que cobrarle al cliente.
*
* */


public class Problema1_4 {
    public static void main(String[] args) { // INICIO
        // precio de litro fijo 8.20.
        double precioGasolina = 8.20;
        double galonesGasolina = 0;

        // Consideracion: 1 galon = 3.785 litros.

        double total = galonesGasolina * 3.785 * precioGasolina;

        System.out.println("El precio total es: " + total);

    } // FIN
}
