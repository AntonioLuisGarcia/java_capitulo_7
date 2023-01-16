
/**
 * 
 * Genera números aleatorios entre el 1 y el 5, de manera que se rellenen las
 * asignaturas en el horario correspondiendo a los siguientes números:
 * 1: "BBDD"
 * 2: "LMARCAS";
 * 3: "PROG";
 * 4: "ENTDES";
 * 5: "SINF";
 * 6: "FOL";
 *
 * @author: Marina Ruiz Artacho
 **/

public class Horario_paso3 {
    public static void main(String[] args) {
        String recreo = "";
        int h = 8;
        int m = 15;
        int min = 1;
        int max = 6;
        int aleatorio = 0;
        String asignatura;

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
                     * Si no es la fila 3, generamos un número aleatorio entre 1 y 6.
                     */
                    aleatorio = (int) (Math.random() * ((max - min) + 1)) + min;
                    /*
                     * Se decide a qué asignatura corresponde ese número para imprimirlo abajo.
                     */
                    switch (aleatorio) {
                        case 1:
                            asignatura = "BBDD";
                            break;
                        case 2:
                            asignatura = "LMARCAS";
                            break;
                        case 3:
                            asignatura = "PROG";
                            break;
                        case 4:
                            asignatura = "ENTDES";
                            break;
                        case 5:
                            asignatura = "SINF";
                            break;
                        default:
                            asignatura = "FOL";
                    }
                    /*
                     * Desde la columna 1 (lunes) a la 5 (viernes), imprime la asignatura elegida
                     * aleatoriamente
                     */
                    System.out.printf("  %-7s  |", asignatura);
                }
            }
            System.out.println();
        }
    }
}