/* PROBLEMA 2.101
 * Dado como tres numeros reales, identifique cual es el mayor.
 * Considere que los numeros pueden ser iguales. Desarrolle el
 * diagrama de flujo correspondiente.
 * */

public class Problema2_10 {
    public static void main(String[] args) { // INICIO
        int a = 9;
        int b = 400;
        int c = 72;


        if (a > b) {
            if (a > c) {
                System.out.println("A es el mayor");
            } else if (a == c) {
                System.out.println("A y C son los mayores");
            } else {
                System.out.println("C es el mayor");
            }
        } else if(a == b) {
            if (a > c){
                System.out.println("A y B son los mayores");
            } else if (a == c) {
                System.out.println("A, B y C son iguales");
            } else {
                System.out.println("C es el mayor");
            }
        } else if(b > c) {
            System.out.println("B es el mayor");
        } else if (b == c) {
            System.out.println("B y C son los mayores");
        } else {
            System.out.println("C es el mayor");
        }
    }
} // FIN
