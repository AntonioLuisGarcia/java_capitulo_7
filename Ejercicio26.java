// Ejercicio 5
// Realiza un programa que rellene un array de 6 filas por 10 columnas con
// números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
// continuación, el programa deberá dar la posición tanto del máximo como del
// mínimo.


import java.util.Scanner;
public class Ejercicio26{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
        int [][] array= new int[6][10];

        //le asignamos valores a cada posicion del array

        for(int filas=0;filas<6;filas++){

            for(int columnas=0;columnas<10;columnas++){
                array[filas][columnas]=(int)(Math.random()*1001);
            }
        }

        //mostramos los numeros aleatorios

        for(int filas=0;filas<6;filas++){
                        
            for(int columnas=0;columnas<10;columnas++){
                System.out.printf("%10s",array[filas][columnas]);
            }
            
            System.out.println();
        }

        //creamos las variables para guardar las posiciones del maximo y del minimo

        int maximo=0;
        int minimo=1002;
        int filaMaximo=-1;
        int columnaMaximo=-1;
        int filaMinimo=-1;
        int columnaMinimo=-1;

        for(int filas=0;filas<6;filas++){

            for(int columnas=0;columnas<10;columnas++){

                if(array[filas][columnas]>maximo){
                    maximo=array[filas][columnas];
                    filaMaximo=filas;
                    columnaMaximo=columnas;
                }

                if(array[filas][columnas]<minimo){
                    minimo=array[filas][columnas];
                    filaMinimo=filas;
                    columnaMinimo=columnas;
                }

            }
        }

        System.out.println();

        System.out.println("El numero mayor esta en la fila "+filaMaximo+" y en la columna "+columnaMaximo);
        System.out.println("El numero menor esta en la fila "+filaMinimo+" y en la columna "+columnaMinimo);
        sc.close();
        }
	}