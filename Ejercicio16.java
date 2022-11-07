// Ejercicio 16
// Escribe un programa que rellene un array de 20 elementos con números enteros
// aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
// programa mostrará el array y preguntará si el usuario quiere resaltar los
// múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
// escribiendo los números que se quieren resaltar entre corchetes.

import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        //relleno el array con numeros aleatorios entre 0 y 400
        
        for(int i=0;i<20;i++){
            array[i]=(int)(Math.random()*401);
        }
        
        //aqui los muestro y pido que numeros quiere que remarque

        for(int i=0;i<20;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.print("¿Qué números quiere resaltar? (1.Los múltiplos de 5 , 2.Los múltiplos de 7): ");
        int decision=sc.nextInt();

        //hare un switch para cada opcion y dentro de cada caso marcare a los numeros

        switch(decision){

            case 1:

            //compruebo que cada numero del array es multiplo de 5 y si lo es lo muestro con corchetes
            
            for(int i=0;i<20;i++){
                if(array[i]%5==0){
                    System.out.print("["+array[i]+"] ");
                }else{
                    System.out.print(array[i]+" ");
                }
            }
            
            break;

            //compruebo que cada numero del array es multiplo de 7 y si lo es lo muestro con corchetes

            case 2:
            
                for(int i=0;i<20;i++){
                    if(array[i]%7==0){
                        System.out.print("["+array[i]+"] ");
                    }else{
                        System.out.print(array[i]+" ");
                    }
                }

            break;

        }

      sc.close();
    }
  }