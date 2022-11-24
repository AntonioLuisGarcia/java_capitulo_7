/*
 * Ejercicio 13
 *Realiza un programa que calcule la estatura media, mínima y máxima en
 *centímetros de personas de diferentes países. El array que contiene los
 *nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 *“Australia”}. Los datos sobre las estaturas se deben simular mediante un
 *array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 *140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 *los países se deben mostrar utilizando el array de países (no se pueden escribir
 *directamente).
 * 
 * @author Antonio Luis Garcia
 */
import java.util.Scanner;
public class Ejercicio34{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String[] paises={"España","Rusia","Japon","Australia"};
        int[][] tabla= new int[4][10];
        int maximo=0;
        int minimo=1000;
        int total=0;

        System.out.printf("%57s %3s %3s","MED","MIN","MAX\n");

        for(int i=0;i<4;i++){
            maximo=0;
            minimo=210;
            total=0;
            System.out.printf("%10s: ",paises[i]);
            for(int j=0;j<10;j++){
                tabla[i][j]=(int)(Math.random()*71+140);
                System.out.print(tabla[i][j]+" ");
                if(tabla[i][j]<minimo){
                    minimo=tabla[i][j];
                }
                if(tabla[i][j]>maximo){
                    maximo=tabla[i][j];
                }
                total=total+tabla[i][j];
            }
            System.out.println("| "+total/10+" "+minimo+" "+maximo);
        }


        sc.close();
        }
}