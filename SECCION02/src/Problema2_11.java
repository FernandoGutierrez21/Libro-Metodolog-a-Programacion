/* PROBLEMA 2.11
* El costo de las llamadas telefónicas internacionales depende de la zona
* geográfica en la que se encuentre el país destino y del número de minutos
* hablados. En la siguiente tabla se presenta el costo del minuto por zona.
* A cada zona se le ha asociado una clave.
* */

/* CONSIDERACIONES
*   | CLAVE | ZONA             | PRECIO |
    |:-----:|:----------------:|:------:|
    | 12    | América del Norte | 2      |
    | 15    | América Central  | 2.2    |
    | 18    | América del Sur  | 4.5    |
    | 19    | Europa           | 3.5    |
    | 23    | Asia             | 6      |
    | 25    | África           | 6      |
    | 29    | Oceanía          | 5      |
* */


public class Problema2_11 {
    public static void main(String[] args) { // INICIO
        int clave = 19;
        double minutos = 8;
        double costo = 0;

        switch (clave){
            case 12:
                costo = minutos * 2;
                break;
            case 15:
                costo = minutos * 2.2;
                break;
            case 18:
                costo = minutos * 4.5;
                break;
            case 19:
                costo = minutos * 3.5;
                break;
            case 23:
            case 25:
                costo = minutos * 6;
                break;
            case 29:
                costo = minutos * 5;
                break;
        }

        System.out.println("Costo total de la llamada: " + costo);
    } // FIN
}
