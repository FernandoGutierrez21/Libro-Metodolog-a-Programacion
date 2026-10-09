/* PROBLEMA 1.1
*  Construya in diagrama de flujo tal que dado el costo de un articulo vendido
*  y la cantidad de dinero entregado por el cliente, calcule e imprima el
*  cambio que se debe entregar al mismo
*
* */

public class Problema1_1 {
    public static void main(String args[]){ // INICIO
        // DATOS
        // prepro -> Precio del prducto -> precioProducto
        // pago -> Pago del cliente -> pagoCliente

        float precioProducto = 100;
        float pagoCliente = 150;

        float cambioAEntregar = pagoCliente - precioProducto;

        System.out.println("El cambio del cliente es: " + cambioAEntregar);

    } // FIN
}
