// Ejercicio 21
// Escribe un programa que rellene un array de 15 elementos con números enteros
// comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
// array “cincuerizado”, según el siguiente criterio: si el número que hay en una
// posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
// siguiente múltiplo de 5 que exista a partir de él.


public class Ejercicio21{
	public static void main(String[] args){
        int[] array=new int[15];

        for(int i=0;i<15;i++){
            array[i]=(int)(Math.random()*501);
        }

        for(int i=0;i<15;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");

        //creamos un boolean para usarlo en un do while posteriormente
        //y una variable para que se vaya incrementado el numero del array en el do while
        //hasta que llegue a un multiplo de cinco

        boolean repetir=true;
        int multiplo_cinco=1;

        for(int i=0;i<15;i++){

            //reseteamos las variables para cada numero

            repetir=true;
            multiplo_cinco=array[i];

            if(array[i]%5==0){
                System.out.print(array[i]+" ");
            }else{

                //en caso de que el numero no sea multiplo
                //le vamos sumando uno hasta que lo sea
                //cuando lo sea el boolean repetir sera falso y saldremos del do while
                //con el siguiente numero multiplo de 5

                do{
                    multiplo_cinco++;

                    if(multiplo_cinco%5==0){
                        repetir=false;
                    }

                }while(repetir);

                //podriamos hacer un for ya que como mucho se hara cuatro veces 
                //pero con el do while es mas facil controlar cuando salir

                System.out.print(multiplo_cinco+" ");
            }
        }

        }
	}
