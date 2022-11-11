// Ejercicio 22
// Define un array de números enteros de 3 filas por 6 columnas con nombre num
// y asigna los valores según la siguiente tabla. Muestra el contenido de todos
// los elementos del array dispuestos en forma de tabla como se muestra en la
// figura.

import java.util.Scanner;
public class Ejercicio22{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
        int [][] num= new int[3][6];

        num[0][0]= 0;        
        num[0][1]= 30;        
        num[0][2]= 2;        
        num[0][5]= 5;        
        num[1][0]= 75;        
        num[1][4]= 0;        
        num[2][2]= -2;        
        num[2][3]= 9;        
        num[2][5]= 11;
        
        System.out.printf("%-10s %10s %10s %10s %10s %10s %10s","Array num", "Columna 0" , "Columna 1" , "Columna 2" , "Columna 3" , "Columna 4" , "Columna 5");        

        System.out.println();
        
        for(int filas=0;filas<3;filas++){
            
            System.out.printf("%-10s","Fila "+filas);

            for(int columnas=0;columnas<6;columnas++){
                System.out.printf("%10s",num[filas][columnas]);
            }
            System.out.println();
        }

        sc.close();
        }
	}
