/* PROBLEMA 2.9
* En un cierto pais el impuesto que se debe pagar por los articulos
* se calcula mediante la siguiente regla: los primeros $20 no causan
* impuestos, los siguientes $20 tienen el 30% de impuesto y resto el
* 40% de impuesto, pero si el costo del producto es mayor a $500,
* entonces en lugar de 40% se cobra el 50%.
* Diseñe un diagrama de flujo que lea el costo basico de un articulo
* y calcule su precio total (precio total = precio basico + impuesto)
*
* */

public class Problema2_9 {
    public static void main(String[] args) { // INICIO
        double precioBasico = 360.2;
        double impuesto = 0;

        if (precioBasico > 500) {
            // Los primeros 20 no se cobran impuesto. No se toma en cuenta.
            // En los segundos 20, o sea de 20 a 40 se cobra el 30% (10 * 0.30).
            // Ya se calcularon los primeros 20 y los segundos 20 (40 en total),
            // por esta razon la resta de precioBasico menos 40.
            // El resultado de precioBasico menos 40 es el resto a un 50% de impuesto.
            impuesto = 20 * 0.30 + (precioBasico - 40) * 0.50;
        } else if (precioBasico > 40) {
            impuesto = 20 * 0.30 + (precioBasico - 40) * 0.40;
        } else if (precioBasico > 20) {
            impuesto = (precioBasico - 20) * 0.30;
        } else {
            impuesto = 0;
        }

        double precioTotal = precioBasico + impuesto;

        System.out.println("El precio Basico es " + precioBasico + " y el total es " + precioTotal);


    } // FIN
}
