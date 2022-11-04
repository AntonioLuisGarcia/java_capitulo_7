// Ejercicio 5
// Escribe un programa que pida 10 números por teclado y que luego muestre los
// números introducidos junto con las palabras “máximo” y “mínimo” al lado del
// máximo y del mínimo respectivamente.


import java.util.Scanner;
public class Ejercicio05{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un array de 12 int");
        int []num=new int[10];
        int mayor=num[0];
        int menor=274587181;
        for(int i=1;i<=10;i++){
            num[i-1]=sc.nextInt();
        }
        for(int i=1;i<num.length;i++){
            if(num[i]>mayor){
                mayor=num[i];
            }
        }
        for(int j=1;j<num.length;j++){
            if(num[j]<menor){
                menor=num[j];
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(num[i]+" ");
            if(num[i]==mayor){
                System.out.print("maximo");
            }
            if(num[i]==menor){
                System.out.print("minimo");
            }
            System.out.println();

        }
        sc.close();
        }
	}