/* PROBLEMA 2.3
* Las raices reales de la expresion a(x**2) + bc + c = 0 se
* obtiene a traves de la formula:
* x = (-b +- raiz cuadrada((b**2)-4ac)) / 2a
*
* Haga el diagrama de flujo para calcular las raices reales,
* de ser posible, de una ecuacion de segundo grado
* */


/* CONSIDERACIONES
* a tiene que ser diferentes de 0 ya que no se puede una
* division entre 0
* */

public class Problema2_3 {
    public static void main(String[] args) { // INICIO
        double a = 3;
        double b = 9;
        double c = 1.5;

        double discriminante = Math.pow(b, 2) - 4 * a * c;
        System.out.println(discriminante);

        if (discriminante >= 0 ){
            double x1 = ((-1 * b) + Math.sqrt(discriminante)) / (2 * a);
            double x2 = ((-1 * b) - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Raices reales " + x1 + ", " + x2);
        }



    } // FIN
}
