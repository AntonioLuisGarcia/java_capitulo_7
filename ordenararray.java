
import java.util.Scanner;
public class ordenararray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud=20;
        int array[]=new int[longitud];
        int auxiliar=0;
        for(int i=0;i<longitud;i++){
            array[i]=(int)(Math.random()*200+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();

        //los ordenamos de mayor a menor

        for(int i=1;i<longitud;i++){
            for(int j=1;j<longitud;j++){
                if(array[j]>array[j-1]){
                    auxiliar=array[j];
                    array[j]=array[j-1];
                    array[j-1]=auxiliar;
                }
            }
        }

        int contadorpares=0;
        int contadorimpares=0;

        for(int i=0;i<longitud;i++){
            System.out.print(array[i]+" ");
            
            if(array[i]%2==0){
                contadorpares++;
            }else{
                contadorimpares++;
            }
        }
        System.out.println();
        System.out.println();

        //los ordenaremos de pares e impares
        
        int espejopares=0;
        int espejoimpares=0;
        int[] pares=new int[contadorpares];
        int[] impares=new int[contadorimpares];

            for(int i=0;i<longitud;i++){
                if(array[i]%2==0){
                    pares[espejopares]=array[i];
                    espejopares++;
                }else{
                    impares[espejoimpares]=array[i];
                    espejoimpares++;
                }
            }

            for(int i=0;i<longitud;i++){
                if(i<contadorpares){
                    array[i]=pares[i];
                }else{
                    array[i]=impares[i-contadorpares];
                }
                System.out.print(array[i]+" ");
            }

            System.out.println();
            System.out.println();

            //ahora con un bidimensional,primero le daremos valores

            int filas=5;
            int columnas=10;

            int[][] bidimensional=new int[filas][columnas];

            for(int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){
                    bidimensional[i][j]=(int)(Math.random()*10);
                    System.out.printf("%2d ",bidimensional[i][j]);
                }
                System.out.println();
            }

            //le diremos al usuario que diga un numero y le diremos cuantas veces esta en el array
            
            System.out.println("Que numero quieres buscar");
            int numero=sc.nextInt();
            int contadorveces=0;

            for(int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){
                    if(bidimensional[i][j]==numero){
                        contadorveces++;
                    }
                }
            }
            
            System.out.printf("Se repite el %d, %d veces",numero,contadorveces);

            /*****************************************************************************/

            System.out.println("");
            System.out.print("Diga cuantos numeros quieres contar:");
            System.out.println("");

            int numerodearray=sc.nextInt();
            int[][] dearray =new int[numerodearray][2];

            for(int i=0;i<numerodearray;i++){
                dearray[i][0]=sc.nextInt();
            }

            for(int i=0;i<numerodearray;i++){
                for(int j=0;j<filas;j++){
                    for(int k=0;k<columnas;k++){
                        if(bidimensional[j][k]==dearray[i][0]){
                            dearray[i][1]++;
                        }
                    }
                }
            }

            for(int i=0;i<numerodearray;i++){
                System.out.printf("El numero %d %d \n",dearray[i][0],dearray[i][1]);
            }
        
        sc.close();
    }
}
