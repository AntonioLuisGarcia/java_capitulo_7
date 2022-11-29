/*
 *Gira una matriz.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class giroMatriz{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz=new int[10][10];
        int[][] auxiliar=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                matriz[i][j]=(int)(Math.random()*50+1);
                System.out.printf("%3d ",matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){

                //auxiliar[i][j]=matriz[9-j][i];
                auxiliar[9-j][i]=matriz[i][j];
            }
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf("%3d ",auxiliar[i][j]);
            }
            System.out.println();
        }
            

        sc.close();
        
        }
}