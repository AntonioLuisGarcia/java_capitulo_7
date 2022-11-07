// Ejercicio 17
// Escribe un programa que muestre por pantalla un array de 10 números enteros
// generados al azar entre 0 y 100. A continuación, el programa debe pedir un
// número al usuario. Se debe comprobar que el número introducido por teclado
// se encuentra dentro del array, en caso contrario se mostrará un mensaje por
// pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
// correctamente. A continuación, el programa rotará el array hacia la derecha
// las veces que haga falta hasta que el número introducido quede situado en la
// posición 0 del array. Por último, se mostrará el array rotado por pantalla.

import java.util.Scanner;
public class Ejercicio17{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        //relleno el array con numeros aleatorios entre 0 y 100
        
        for(int i=0;i<10;i++){
            array[i]=(int)(Math.random()*101);
        }
        
        //aqui los muestro y pido un numero para luego comprobar que esta en el array 

        for(int i=0;i<10;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();

        int numero;
        boolean seguir_preguntando=true;

        //pedimos el numero y comprobamos que es igual a alguno del array
        //sino lo volvemos a pedir y escibimos un mensaje

        do{
            System.out.println("Diga un numero");
            numero=sc.nextInt();
            for(int i=0;i<10;i++){
                if(array[i]==numero){
                    seguir_preguntando=false;
                }
            }

            if(seguir_preguntando){
                System.out.println("Ponga un numero del array, por favor");
            }

        }while(seguir_preguntando);

        //esta variable servira para saber la longitud del array auxiliar

        int posicion=0;

        for(int i=0;i<10;i++){
            posicion++;
            if(array[i]==numero){
                break;
            }
        }

        int[] array_auxiliar=new int[posicion-1];

        for(int i=0;i<posicion-1;i++){
            array_auxiliar[i]=array[i];
        }

        for(int i=posicion-1;i<10;i++){
            System.out.print(array[i]+" ");
        }

        for(int i=0;i<posicion-1;i++){
            System.out.print(array_auxiliar[i]+" ");
        }

      sc.close();
    }
  }