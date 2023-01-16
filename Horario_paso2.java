
/**
 * 
 * Añadir a la tabla la palabra R-E-CR-E-O en la fila del medio, escribiendo
 * cada letra en un día de la semana. Añadir además la hora de inicio de cada
 * clase.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Horario_paso2 {
    public static void main(String[] args) {
        String recreo = "";
        int h = 8;
        int m = 15;

        /*
         * Se imprime el encabezado con los días de la semana y la línea de separación
         */
        System.out.printf("%6s|   LUNES   |  MARTES   | MIÉRCOLES |  JUEVES   |  VIERNES  |\n", "");
        System.out.printf("-------------------------------------------------------------------\n", "");
        for (int i = 0; i < 7; i++) {
            /*
             * Se imprime la primera columna con las horas y los minutos. Se van sumando
             * horas. A partir de la fila 4, los minutos son 45 y quitamos una hora para
             * empezar a las 11
             */
            if (i == 4) {
                m = 45;
                h--;
            }
            System.out.printf("%2d:%2d |", h, m);
            h++;
            for (int j = 1; j <= 5; j++) {
                /*
                 * Si estamos en la fila 3 (i==3), dependiendo de la columna (j) en la que nos
                 * encontremos, imprime una parte de la palabra R-E-CR-E-O
                 */
                if (i == 3) {
                    switch (j) {
                        case 1:
                            recreo = "R";
                            break;
                        case 2:
                            recreo = "E";
                            break;
                        case 3:
                            recreo = "CR";
                            break;
                        case 4:
                            recreo = "E";
                            break;
                        default:
                            recreo = "O";
                    }
                    System.out.printf("    %2s     |", recreo);
                } else {
                    /*
                     * Desde la columna 1 (lunes) a la 5 (viernes), imprime 'subject'
                     */
                    System.out.printf("  %-7s  |", "subject");
                }
            }
            System.out.println();
        }
    }
}