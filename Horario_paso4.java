
/**
 * 
 * Ajusta el horario de manera que semanalmente solo haya:
 * 6 horas de "BBDD"
 * 4 horas de "LMARCAS";
 * 8 horas de "PROG";
 * 3 horas de "ENTDES";
 * 6 horas de "SINF";
 * 3 horas de "FOL";
 *
 * @author: Marina Ruiz Artacho
 **/

public class Horario_paso4 {
    public static void main(String[] args) {
        String recreo = "";
        int h = 8;
        int m = 15;
        int min = 1;
        int max = 6;
        int aleatorio = 0;
        String asignatura;
        /*
         * Asignamos el total de horas que tiene cada asignatura semanalmente
         */
        int bbdd = 6;
        int lmarcas = 4;
        int prog = 8;
        int entdes = 3;
        int sinf = 6;
        int fol = 3;

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
                    do {
                        /*
                         * Si no es la fila 3, generamos un número aleatorio entre 1 y 6. Si el número
                         * aleatorio generado corresponde a una asignatura que ya ha alcanzado el 0 en
                         * las horas que se asignaron, vuelve a generar otro número aleatorio.
                         */
                        aleatorio = (int) (Math.random() * ((max - min) + 1)) + min;
                    } while ((aleatorio == 1 && bbdd == 0)
                            || (aleatorio == 2 && lmarcas == 0)
                            || (aleatorio == 3 && prog == 0)
                            || (aleatorio == 4 && entdes == 0)
                            || (aleatorio == 5 && sinf == 0)
                            || (aleatorio == 6 && fol == 0));
                    /*
                     * Se decide a qué asignatura corresponde ese número para imprimirlo abajo.
                     */
                    switch (aleatorio) {
                        case 1:
                            asignatura = "BBDD";
                            bbdd--;
                            break;
                        case 2:
                            asignatura = "LMARCAS";
                            lmarcas--;
                            break;
                        case 3:
                            asignatura = "PROG";
                            prog--;
                            break;
                        case 4:
                            asignatura = "ENTDES";
                            entdes--;
                            break;
                        case 5:
                            asignatura = "SINF";
                            sinf--;
                            break;
                        default:
                            asignatura = "FOL";
                            fol--;
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