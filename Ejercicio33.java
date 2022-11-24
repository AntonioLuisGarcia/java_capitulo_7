/*
 *Ejercicio 12
 *Realiza un programa que muestre por pantalla un array de 9 filas por 9
 *columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 *programa debe mostrar los números de la diagonal que va desde la esquina
 *inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 *y la media de los números que hay en esa diagonal.
 *
 *@author Antonio Luis Garcia 
 */

import java.util.Scanner;
public class Ejercicio33{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int[][] cuadrado= new int[9][9];
        int maximo=0;
        int minimo=1000;
        int total=0;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                cuadrado[i][j]=(int)(Math.random()*401+500);

                if(i+j==9){
                    System.out.printf("%3d ",cuadrado[i][j]);
                    total=total+cuadrado[i][j];
                    if(cuadrado[i][j]>maximo){
                        maximo=cuadrado[i][j];
                    }

                    if(cuadrado[i][j]<minimo){
                        minimo=cuadrado[i][j];
                    }

                }else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        System.out.println("El maximo valor es "+maximo+" y el minimo "+minimo+" y la media es "+total/10);
        


        sc.close();
        }
}