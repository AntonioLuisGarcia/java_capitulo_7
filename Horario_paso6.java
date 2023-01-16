
/**
 * 
 * Uno de los profesores, solo puede dar clase las tres primeras horas, da igual
 * qué día de la semana sea. Se tiene que pedir al usuario que introduzca de qué
 * asignatura es el profesor (no puede ser FOL). Si la asignatura es SINF, los
 * viernes solo podrá ser las 3 primeras horas.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Horario_paso6 {
    public static void main(String[] args) {
        /*
         * Añadimos la solicitud al usuario para ver qué profesor solo viene las
         * primeras horas. Ojo al control de errores.
         */
        Scanner s = new Scanner(System.in);
        int profesor = 1;
        System.out.println("1: BBDD \n2: LMARCAS \n3: PROG \n4: ENTDES \n5: SINF");
        do {
            if (profesor < 1 || profesor > 5)
                System.out.print("Esa asignatura no existe. ");
            System.out.print("¿Qué asignatura da el profesor que solo puede venir a las 3 primeras horas? ");
            profesor = s.nextInt();
        } while (profesor < 1 || profesor > 5);
        s.close();

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
         * SI PROFESOR ES 5 (SINF), VIERNES ES 5, si no, generamos un número entre 5 y
         * para ver si hay FOL o SINF las 3 primeras horas el viernes
         */
        int viernes = profesor == 5 ? 5 : (int) (Math.random() * ((6 - 5) + 1)) + 5;

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
                     * Aquí establecemos que al profesor aún le quedan horas por dar (true) y un
                     * contador para ver si hemos hecho el bucle do-while más de una vez
                     */
                    Boolean quedanHorasDeProfesor = true;
                    int count = 0;
                    do {
                        /*
                         * Si el bucle se ha hecho más de una vez, el aleatorio coindice con la
                         * asignatura del profesor, damos por hecho que no le quedaban horas, lo ponemos
                         * en false (si el bucle entra de nuevo es porque las horas eran 0)
                         */
                        if (count > 0 && aleatorio == profesor)
                            quedanHorasDeProfesor = false;
                        /* Una vez que entramos al bucle, sumamos al contador */
                        count++;
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
                        /*
                         * Si estamos antes del recreo y es de lunes a jueves y al profesor le quedan
                         * horas, aleatorio será la asignatura del profesor
                         */
                        else if (i < 3 && j < 5 && quedanHorasDeProfesor)
                            aleatorio = profesor;
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