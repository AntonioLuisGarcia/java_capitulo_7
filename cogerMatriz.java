/*
 *Gira una matriz1.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class cogerMatriz{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("diga la longitud del array");
        int capa=sc.nextInt();
        System.out.println("Introduce la fila inicial que quieres extraer (0-4):");
        int filamin=sc.nextInt();
        System.out.println("Introduce la fila final que quieres extraer (0-4):");
        int filamax=sc.nextInt();
        System.out.println("Introduce la columna inicial que quieres extraer (0-"+(capa-1)+"):");
        int columnaMin=sc.nextInt();
        System.out.println("Introduce la columna final que quieres extraer (0-"+(capa-1)+"):");
        int columnaMax=sc.nextInt();

        int[][] matriz=new int[capa][capa];

        for(int i=0;i<capa;i++){
            for(int j=0;j<capa;j++){
                matriz[i][j]=(int)(Math.random()*50+1);
                System.out.printf("%3d ",matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        
        for(int i=0;i<capa;i++){
            for(int j=0;j<capa;j++){
                if((i>=filamin && j<=columnaMax && i<=filamax && j>=columnaMin)){
                System.out.printf("%3d ",matriz[i][j]);
                }else{
                    System.out.printf("%3d ",0);
                }
            }
            System.out.println();
        }


        sc.close();
        
        }
}