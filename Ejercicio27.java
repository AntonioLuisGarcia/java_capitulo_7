// Ejercicio 6
// Modifica el programa anterior de tal forma que no se repita ningún número en
// el array.

import java.util.Scanner;
public class Ejercicio27{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
        int [][] array= new int[6][10];

        //le asignamos valores a cada posicion del array
        //y comprobamos que son diferentes

        for(int filas=0;filas<6;filas++){

            for(int columnas=0;columnas<10;columnas++){
                array[filas][columnas]=(int)(Math.random()*1001);
            }
        }

        //creamos un boolean para comprobar cuando dos numeros se repitan
        //iremos recorriendo el array y comprobaremos por cada numero todos los anteriores

        boolean numeroIgual=true;

        for(int contador=0;contador<=60;contador++){

            for(int filas=0;filas<6;filas++){

                for(int columnas=0;columnas<10;columnas++){
                    
                    numeroIgual=false;

                    for(int filas1=0;filas1<filas;filas1++){

                        for(int columnas1=0;columnas1<columnas;columnas1++){
                            if(array[filas][columnas]==array[filas1][columnas1]){
                                numeroIgual=true;
                            }
                        }
                    }

                    if(numeroIgual){
                        array[filas][columnas]=(int)(Math.random()*1001);
                    }
                }
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