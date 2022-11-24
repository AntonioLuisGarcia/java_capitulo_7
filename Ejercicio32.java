/*
 * Ejercicio 11
 *Realiza un programa que muestre por pantalla un array de 10 filas por 10
 *columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 *programa debe mostrar los números de la diagonal que va desde la esquina
 *superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 *y la media de los números que hay en esa diagonal.
 * 
 *@author Antonio Luis Garcia 
 */

import java.util.Scanner;
public class Ejercicio32{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int[][] cuadrado= new int[10][10];
        int maximo=0;
        int minimo=301;
        int total=0;

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                cuadrado[i][j]=(int)(Math.random()*101+200);

                if(i==j){
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