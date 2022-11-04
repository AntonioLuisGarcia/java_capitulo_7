// Ejercicio 6
// Escribe un programa que lea 15 números por teclado y que los almacene en un
// array. Rota los elementos de ese array, es decir, el elemento de la posición 0
// debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
// la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
// del array.

import java.util.Scanner;
public class Ejercicio06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un array de 15 int y lo desordaremos");
        int[] arrays= new int[15];
        for(int i=0;i<15;i++){
            arrays[i]=sc.nextInt();
        }
        for(int i=1;i<=15;i++){
            if(i==15){
                System.out.println(arrays[0]);
            }else{
            System.out.println(arrays[i]);
            }
        }
        
        sc.close();
        }
	}