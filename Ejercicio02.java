// Ejercicio 2
// Define un array de 10 caracteres con nombre simbolo y asigna valores a los
// elementos según la tabla que se muestra a continuación. Muestra el contenido
// de todos los elementos del array. ¿Qué sucede con los valores de los elementos
// que no han sido inicializados?

import java.util.Scanner;
public class Ejercicio02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un array de 12 int");
        String []num=new String[12];
        num[0]="a";
        num[1]="x";
        num[3]="@";
        num[5]="";
        num[6]="+";
        num[7]="Q";

        for(int i=1;i<=12;i++){
            System.out.println(num[i-1]);
        }
        //los valores que no se han inicializado salen como nulos
        sc.close();
        }
	}
