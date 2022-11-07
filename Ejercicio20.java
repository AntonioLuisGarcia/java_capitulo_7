// Ejercicio 20
// Implementa un programa que calcule la denominación ordinal de los reyes de
// una secuencia histórica. El programa solicitará la cantidad de reyes que se
// van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
// por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
// por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
// aparecer como Felipe 1º y el segundo como Felipe 2º.

import java.util.Scanner;
public class Ejercicio20{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("");

        //pedimos la longitud del array

        System.out.println("Introduzca el número total de nombres de reyes: ");
        int longitud=sc.nextInt();

        System.out.println("Vaya introduciendo los nombres de los reyes(en mayuscula) y pulsando INTRO.");
        
        //creamos el array y le damos valores

        String[] reyes= new String[longitud];

        for(int i=0;i<longitud;i++){
            reyes[i]=sc.next();
        }

        for(int i=0;i<longitud;i++){
            System.out.println(reyes[i]);
        }
        
        System.out.println();

        int contador_nombres=1;
       
        //aqui imprimiremos los nombres y compararemos comn los anteriores para saber cuantos hay con el mismo nombre

        for(int i=0;i<reyes.length;i++){

            contador_nombres=1;

            if(i==0){
                System.out.println(reyes[i]+" 1º");
            }else{

                    for(int j=0;j<i;j++){
                        if(reyes[i].equals(reyes[j])){
                            contador_nombres++;
                        }
                    }

                System.out.println(reyes[i]+" "+contador_nombres+"º");
            }

        }

        sc.close();
        }
	}
