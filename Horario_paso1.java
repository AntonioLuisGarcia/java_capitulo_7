/**
 * Pintar por pantalla una tabla de 8 filas y 6 columnas con encabezados de los
 * días de la semana. La primera columna serán solo 6 espacios en blanco. Para
 * completar se escribe la palabra 'subject'
 *
 * @author: Marina Ruiz Artacho
 **/

public class Horario_paso1 {
    public static void main(String[] args) {
        /*
         * Se imprime el encabezado con los días de la semana y la línea de separación
         */
        System.out.printf("%6s|   LUNES   |  MARTES   | MIÉRCOLES |  JUEVES   |  VIERNES  |\n", "");
        System.out.printf("-------------------------------------------------------------------\n", "");
        for (int i = 0; i < 7; i++) {
            /*
             * Se imprime la primera columna con 6 espacios
             */
            System.out.printf("%6s|", "");
            for (int j = 1; j <= 5; j++) {
                /*
                 * Desde la columna 1 (lunes) a la 5 (viernes), imprime 'subject'
                 */
                System.out.printf("  %-7s  |", "subject");
            }
            System.out.println();
        }
    }
}