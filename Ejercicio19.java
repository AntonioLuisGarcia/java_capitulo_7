// Ejercicio 19
// Realiza un programa que sea capaz de insertar un número en una posición
// concreta de un array. En primer lugar, el programa generará un array de 12
// números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
// debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
// el programa preguntará por el número que se quiere insertar y por la posición
// donde será insertado. Los números del array se desplazan a la derecha para
// dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
// siempre se perderá.

import java.util.Scanner;
public class Ejercicio19{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("");
        int[] array= new int[12];

        for(int i=0;i<12;i++){
            array[i]=(int)(Math.random()*201);
        }

        System.out.printf("%8s","Indice");
            
        for(int i=0;i<12;i++){
            System.out.printf(" %7s",i);
        }
        
        System.out.println("");

        System.out.printf("%8s","Valor");
        
        for(int i=0;i<12;i++){
            System.out.printf(" %7s",array[i]);
        }
        
        System.out.println();
        
        System.out.print("Introduzca el número que quiere insertar: ");
        int numero=sc.nextInt();
        
        System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
        int posicion=sc.nextInt();

        System.out.printf("%8s","Indice");
            
        for(int i=0;i<12;i++){
            System.out.printf(" %7s",i);
        }
        
        System.out.println("");
        
        System.out.printf("%8s","Valor");
        
        for(int i=0;i<12;i++){
            if(i<posicion){
                System.out.printf(" %7s",array[i]);
            }
            if(i==posicion){
                System.out.printf(" %7s",numero);
            }
            if(i>posicion){
                System.out.printf(" %7s",array[i-1]);
            }
        }
        sc.close();
        }
	}
