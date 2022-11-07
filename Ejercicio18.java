// Ejercicio 18
// Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
// ambos incluidos y que los almacene en un array. A continuación, el programa
// debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
// programa debe colocar de forma alterna y en orden los menores o iguales de
// 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
// mayor… Cuando se acaben los menores o los mayores, se completará con los
// números que queden.


public class Ejercicio18{
	public static void main(String[] args){

        System.out.println("Este programa destaca el numero minimo o maximo");
        int[] array= new int[10];

        //llenamos el array con aleatorios

        for(int i=0;i<10;i++){
            array[i]=(int)(Math.random()*201);
        }

        //mostramos los datos con un indice

        System.out.printf("%8s","Indice");
            
        for(int i=0;i<10;i++){
            System.out.printf(" %7s",i);
        }
        
        System.out.println("");

        System.out.printf("%8s","Valor");
        
        for(int i=0;i<10;i++){
            System.out.printf(" %7s",array[i]);
        }

        System.out.println();

        //crearemos dos variables para saber cuantos numeros son mayores y menores a 100

        int contador_mayores100=0;
        int contador_menores100=0;

        //aqui comprobamos cuantos son mayores y menores

        for(int i=0;i<10;i++){
            if(array[i]>=100){
                contador_mayores100++;
            }else{
                contador_menores100++;
            }
        }

        //estos contadores sirven para saber en que posicion de los arrays vamos

        int cont_mayores=0;
        int cont_menores=0;

        //declara los dos arrays uno para los mayores y otro para los menores

        int[] array_mayores100 = new int[contador_mayores100];
        int[] array_menores100 = new int[contador_menores100];

        //aqui comprobamos cuales son mayores y si son lo asignamos al array
        
        for(int i=0;i<10;i++){
            if(array[i]>=100){
                array_mayores100[cont_mayores]=array[i];
                cont_mayores++;
            }
        }

        //aqui comprobamos cuales son menores y si son lo asignamos al array

        for(int i=0;i<10;i++){
            if(array[i]<100){
                array_menores100[cont_menores]=array[i];
                cont_menores++;
            }
        }

        //volvemos a resetear estas variables para volver a usarlas para imprimir los arrays

        cont_mayores=0;
        cont_menores=0;

        System.out.printf("%8s","Indice");
            
        for(int i=0;i<10;i++){
            System.out.printf(" %7s",i);
        }

        System.out.println();

        System.out.printf("%8s","Valor");

        for(int i=0;i<10;i++){
            if(i<array_menores100.length){
                System.out.printf("%9s",array_menores100[i]+" ");
            }

            if(i<array_mayores100.length){
                System.out.printf("%8s",array_mayores100[i]+" ");
            }

        }

 
        }
	}
