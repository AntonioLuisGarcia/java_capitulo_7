// Ejercicio 4
// Modifica el programa anterior de tal forma que las sumas parciales y la suma
// total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
// que el ordenador se queda “pensando” antes de mostrar los números.

import java.util.Scanner;
public class Ejercicio25{
	public static void main(String[] args)
        throws InterruptedException{
		Scanner sc = new Scanner(System.in);
 
        int [][] num= new int[4][5];

        for(int filas=0;filas<4;filas++){

            for(int columnas=0;columnas<5;columnas++){
                num[filas][columnas]=(int)(Math.random()*900+100);
            }

        }

        int suma_total=0;
        int suma_fila=0;
        int suma_columna=0;

        //mostramos los numeros del array y la suma de cada fila

        
        for(int filas=0;filas<4;filas++){
            
            suma_fila=0;
            
            Thread.sleep(500);
            for(int columnas=0;columnas<5;columnas++){
                System.out.printf("%10s",num[filas][columnas]);
                suma_fila=suma_fila+num[filas][columnas];
            }
            Thread.sleep(1000);
            System.out.printf("%10s",suma_fila);
            System.out.println();
        }
        
        //sumamos las columnas y las mostramos junto al total
        
        for(int columnas=0;columnas<5;columnas++){
            
            suma_columna=0;
            
            for(int filas=0;filas<4;filas++){
                suma_columna=suma_columna+num[filas][columnas];
            }
            
            suma_total=suma_total+suma_columna;
            
            Thread.sleep(1000);
            System.out.printf("%10s",suma_columna);
            
        }
        
            Thread.sleep(1000);
            System.out.printf("%10s",suma_total);

        sc.close();
        }
	}