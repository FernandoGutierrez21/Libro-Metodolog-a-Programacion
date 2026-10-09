/* PROBLEMA 1.3
* Escriba un diagrama de flujo tal que dado como dato el nombre deun dinosaurio,
* su peso y su longitud, expresados estos dos ultimos en libras y pies respectivamente;
* escriba el nombre del dinosaurio, su peso en kilogramos y su longitud expresada en
* metros
* */

public class Problema1_3 {
    public static void main(String[] args) { // INICIO
        // tenemos que tener en cuenta que 1 tonelada son 100 kg y 1 pie es 0.3047 metros.

        String nombreDinosaurio = "Tiranosaurio Rex";
        double peso = 8;
        double longitud = 30;

        double pesokg = peso * 1000;
        double longitudMetros = longitud * 0.3047;

        System.out.println("El " + nombreDinosaurio + " pesa "
                + pesokg + "kg y mide " + longitudMetros + " metros.");

    } // FIN
}
