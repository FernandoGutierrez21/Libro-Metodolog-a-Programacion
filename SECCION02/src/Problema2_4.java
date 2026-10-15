/* PROBLEMA 2.4
* Construya un diagrama de flujo tal que dado como datos la
* matricula y 5 calificaciones de un alumno; imprima la matricula,
* el promedio y la palabra "aprobado" si el alumno tiene un
* promedio mayor o igual que 6, y la palabra "no aprobado" en
* caso contrario.
*
* */


public class Problema2_4 {
    public static void main(String[] args) { // INCIO
        int matricula = 514584;
        double calificacion1 = 67.9;
        double calificacion2 = 40;
        double calificacion3 = 40.5;
        double calificacion4 = 59.1;
        double calificacion5 = 78;

        double promedio =( calificacion1 + calificacion2 + calificacion3 +
                calificacion4 + calificacion5) / 5;


            System.out.println(matricula);
            System.out.println(promedio);
        if (promedio >= 60){
            System.out.println("APROBADO");
        } else {
            System.out.println("NO APROBADO");
        }

    } // FIN
}
