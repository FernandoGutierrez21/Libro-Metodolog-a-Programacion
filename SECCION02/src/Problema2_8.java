/* PROBLEMA 2.8
* En una tienda efetuan un descuento a los clientes dependiendo
* del monto de la compre. El descueto se efectua con base en el
* siguiente criterio:
*
* Si el monto es menor que $500 -> no hay decuento.
*
* Si el monto esta comprendido entre $500 y $1,000 -> 5% de descuento.
*
* Si el monto esta comprendido entre $1,000 y $7,000 -> 11% de descuento.
*
* Si el monto esta comprendido entre $7,000 y $15,000 -> 18% de descuento.
*
* Si el monto es mayor a $15,00 -> 25% de descuento.
*
* Construya un diagrama de flujo tal que dado el monto de la compra de un
* cliente, determine lo que el mismo debe pagar.
* */

public class Problema2_8 {
    public static void main(String[] args) { // INICIO
        double monto = 3750;
        double total = 0;

        if (monto < 500){
            total = monto;
        } else if(monto <= 1000) {
            total = monto - (monto * 0.05);
        } else if (monto <= 7000) {
            total = monto - (monto * 0.11);
        } else if (monto <= 15000) {
            total = monto - (monto * 0.18);
        } else {
            total = monto - (monto * 0.25);
        }

        System.out.println("El monto total a pagar es " + total);

    } // FIN
}
