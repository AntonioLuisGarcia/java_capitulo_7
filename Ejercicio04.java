// Ejercicio 4
// Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
// y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
// cuadrado se deben almacenar los cuadrados de los valores que hay en el array
// numero. En el array cubo se deben almacenar los cubos de los valores que hay en
// numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
// columnas.

import java.lang.Math;
public class Ejercicio04{
	public static void main(String[] args){
        System.out.println("Con este programa haremos un array de 12 int");
        int []num=new int[20];

        for(int i=1;i<=20;i++){
            num[i-1]=(int)(Math.random()*101);
        }

        for(int i=1;i<=20;i++)
        System.out.println(num[i-1]+" "+(int)Math.pow(num[i-1],2)+" "+(int)Math.pow(num[i-1],3)+" ");
        }
	}