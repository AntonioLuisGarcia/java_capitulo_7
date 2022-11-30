/*
 *Gira una matriz1.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class seleccionMatriz{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int capa=sc.nextInt();

        int[][] matriz=new int[10][10];

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
                if((i>=capa && j<=9-capa && i<=9-capa && j>=capa) && (i==capa || j==capa || i==9-capa || j==9-capa)){
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