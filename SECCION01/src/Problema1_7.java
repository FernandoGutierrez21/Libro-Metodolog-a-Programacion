/* PROBLEMA 1.7
* Construya un diagrama de flujo tal que dados los tres lados de un triangulo,
* pueda determinar su area. Esta la calculamos aplicando la siguiente formula:
*
* Area = raiz cuadrada ( 5 * (S-L1) * (S - L2) * (S - L3) )
*
* Para calcular S como un auciliar
* S = (L1 + L2 + L3) / 2
* */



public class Problema1_7 {
    public static void main(String[] args) { // INICIO
        // Recibimos los datos de los 3 lados del triangulo
        double l1 = 3.86;
        double l2 = 7.43;
        double l3 = 2.00;

        // Calculamos
        double s = (l1 + l2 + l3) / 2;
        double area = Math.sqrt( 5 * (s-l1) * (s - l2) * (s - l3) );

        // Imprimimos el area
        System.out.println("El area del triangulo es " + area);


    } // FIN
}
