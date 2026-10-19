/* PROBLEMA 2.7
* Construya un diagrama de flujo tal que dado como datos de
* entrada tres numeros enteros, determine si los mismo estan
* en orden creciente
* */


public class Problema2_7 {
    public static void main(String[] args) { // INICIO
        int num1 = 3;
        int num2 = 7;
        int num3 = 16;

        if (num1 < num2){
            if (num2 < num3) {
                System.out.println("Los numero estan en orden creciente");
            } else {
                System.out.println("Los numero NO estan en orden creciente");
            }
        } else {
            System.out.println("Los numeros NO estan en orden creciente");
        }
    } // FIN
}
