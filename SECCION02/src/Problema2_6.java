/* PROBLEMA 2.6
* Dado un numero entero A, haga un diagrama de flujo para
* determinar si el mismo es par, impar o nulo
* */


public class Problema2_6 {
    public static void main(String[] args) { // INICIO
        int a = 17;

        if (a == 0) {
            System.out.println("NULO");
        } else {
            if (Math.pow(-1, a) > 0){
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        }



    } // FIN
}
