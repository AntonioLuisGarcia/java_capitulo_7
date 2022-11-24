// Ejercicio 7
// Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
// muestre por pantalla separados por espacios. El programa pedirá entonces por
// teclado dos valores y a continuación cambiará todas las ocurrencias del primer
// valor por el segundo en la lista generada anteriormente. Los números que se
// han cambiado deben aparecer entrecomillados.


import java.util.Scanner;
public class Ejercicio07{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra 100 numeros y luego cambiaras dos de ellos");
        int[] array= new int[100];
        for(int i=0;i<100;i++){
            array[i]=(int)(Math.random()*21);
            System.out.print(array[i]+" ");
        }

        //el bucle para que no sean los mismos numeros aunque sea poco probable coincidir

        System.out.println("");
        System.out.println("Ahora cambiaras dos numeros del array aleatorios");
        int buscar=sc.nextInt();
        System.out.println("Ahora cambiaras dos numeros del array aleatorios");
        int sustituto=sc.nextInt();

        for(int i=0;i<100;i++){
            if(array[i]==buscar){
                array[i]=sustituto;
                System.out.print("\"%d\" "+array[i]+" ");
            }else{
                System.out.print(" "+array[i]+" ");
            }
        }

        sc.close();
        }
	}