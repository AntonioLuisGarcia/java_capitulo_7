// Arrays de una dimensión
// Ejercicio 1
// Define un array de 12 números enteros con nombre num y asigna los valores
// según la tabla que se muestra a continuación. Muestra el contenido de todos
// los elementos del array. ¿Qué sucede con los valores de los elementos que no
// han sido inicializados?


import java.util.Scanner;
public class Ejercicio01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un array de 12 int");
        int []num=new int[12];
        num[0]=39;
        num[1]=-2;
        num[3]=0;
        num[5]=14;
        num[7]=5;
        num[8]=120;

        for(int i=1;i<=12;i++){
            System.out.println(num[i-1]);
        }
        //los valores que no se han inicializado salen con valor cero
        sc.close();
        }
	}