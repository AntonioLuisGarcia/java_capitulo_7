/*
 *Ejercicio 10
 *Realiza el juego de las tres en raya.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class Ejercicio31{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] tablero=new int[3][3];
        int[] posicionesJugador=new int[5];
        int[] posicionesMaquina=new int[5];
        boolean salir=true;
        
        for(int i=0;i<3;i++){
            System.out.print("|");
            for(int j=0;j<3;j++){
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("-------");
        }

        do{
            System.out.println("Diga la fila en la que quiere colocar");
            int fila=sc.nextInt();
            System.out.println("Diga la columna en la que quiere colocar");
            int columna=sc.nextInt();

            for(int i=0;i<3;i++){
                System.out.print("|");
                for(int j=0;j<3;j++){
                    if(i==fila && j==columna){
                        System.out.print("X|");
                    }else{
                        System.out.print(" |");
                    }
                }
                System.out.println();
                System.out.println("-------");
            }

        }while(salir);

        sc.close();
        }
}