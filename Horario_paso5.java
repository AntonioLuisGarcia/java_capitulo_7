
/**
 * 
 * Los viernes solo puede haber 3 horas de FOL desde primera y 3 horas de SINF
 * desde cuarta, o viceversa.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Horario_paso5 {
    public static void main(String[] args) {
        String recreo = "";
        int h = 8;
        int m = 15;
        int min = 1;
        /* El máximo ahora es 5 porque FOL la consideramos aparte */
        int max = 5;
        int aleatorio = 0;
        String asignatura;
        /*
         * Asignamos el total de horas que tiene cada asignatura semanalmente.
         * DEJAMOS 3 HORAS PARA SINF (las otras 3 h son los viernes) Y QUITAMOS FOL
         */
        int bbdd = 6;
        int lmarcas = 4;
        int prog = 8;
        int entdes = 3;
        int sinf = 3;
        /*
         * Generamos un número entre 5 y 6 para ver si hay FOL o SINF las 3 primeras
         * horas el viernes
         */
        int viernes = (int) (Math.random() * ((6 - 5) + 1)) + 5;

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
                         * Si son las 3 primeras horas del viernes, asignatura es la que tocó
                         * aleatoriamente en viernes.
                         */
                        if (j == 5 && i < 3)
                            aleatorio = viernes == 6 ? 6 : 5;
                        /*
                         * A partir del cuarta hora del viernes, asignatura es la contraria a la que
                         * tocó aleatoriamente en viernes.
                         */
                        else if (j == 5)
                            aleatorio = viernes == 6 ? 5 : 6;
                        else {
                            /*
                             * Generamos un número aleatorio entre 1 y 5. Si el número
                             * aleatorio generado corresponde a una asignatura que ya ha alcanzado el 0 en
                             * las horas que se asignaron, vuelve a generar otro número aleatorio.
                             * Quitamos FOL entre las condiciones y añadimos que no sea el viernes (quedaría
                             * en un bucle cuando sinf llega a 0)
                             */
                            aleatorio = (int) (Math.random() * ((max - min) + 1)) + min;
                        }
                    } while ((aleatorio == 1 && bbdd == 0)
                            || (aleatorio == 2 && lmarcas == 0)
                            || (aleatorio == 3 && prog == 0)
                            || (aleatorio == 4 && entdes == 0)
                            || (aleatorio == 5 && sinf == 0)
                                    && j != 5);
                    /*
                     * Se decide a qué asignatura corresponde ese número para imprimirlo abajo.
                     * AÑADIMOS UNA CONDICIÓN PARA RESTAR EN SINF SOLO SI NO ES VIERNES
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
                            if (j != 5)
                                sinf--;
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