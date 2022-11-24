/*
 * Dibujare una matriz en la que pedire los numeros que se quieren poner en cada cuadrado
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class matrizExtra{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int[][] cuadrado=new int[12][12];
        int[] numeros=new int[6];
        int contador=0;

        for(int i=0;i<6;i++){
            System.out.println("diga el numero del cuadrado");
            numeros[i]=sc.nextInt();
        }

        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){

                if(contador==i || contador==j || j==i-contador || i== j-contador){
                    System.out.println(numeros[contador]);
                }

            }

            if(i<5){
                contador++;
            }else{
                contador--;
            }
            System.out.println();

        }

        sc.close();
        }
}