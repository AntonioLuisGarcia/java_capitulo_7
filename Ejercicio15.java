// Ejercicio 15
// Un restaurante nos ha encargado una aplicación para colocar a los clientes en
// sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
// (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
// el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
// un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
// “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
// como máximo e intente de nuevo”. Para el grupo que llega, se busca
// siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
// busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
// dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
// las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
// nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
// pueden romper aunque haya huecos sueltos suficientes.

import java.util.Scanner;
public class Ejercicio15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa cambia dos numeros de un array");
        int[] mesas= new int[10];

        for(int i=0;i<10;i++){
            mesas[i]=(int)(Math.random()*5);
        }

        //declaramos un boolean para seguir en el bucle cuando sea false, es decir, sea mayor a -1
        //el ejercicio solo pide que se salga con el -1 pero le añadire los demas negativos para que no haya escepciones

        boolean seguir=true;

        //este boolean es para cuando el numero de mesas no permita almacenar a los nuevos clientes

        boolean ifs=true;
        
        do{

            //lo volvemos a declarar true cada vez que entremos por que sino una vez que sea falso no se cambiara nunca mas

            ifs=true;   

            //mostramos el numero de mesas
            
            System.out.printf("%10s","Mesa Nº");
            
            for(int i=1;i<=10;i++){
                System.out.printf(" %7s",i);
            }
            
            System.out.println("");

            //mostramos el numero de personas en las mesas
            
            System.out.printf("%10s","Ocupacion");
            
            for(int i=0;i<10;i++){
                System.out.printf(" %7s",mesas[i]);
            }
            
            System.out.println("");

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");

            int personas=sc.nextInt();
            
            //chequeamos de que no sean negativas las personas o mayores a 4

            if(personas==-1){

                System.out.println("Gracias. Hasta pronto.");
                seguir=false;

            }else{

                    if(personas>4){

                        System.out.println("Lo siento, en estos momentos no queda sitio.");     
                        
                    }else{
                        
                        //con un for ira comprobando todas las posiciones de las mesas 
                        //las personas se sentaran en la primera mesa que puedan no en la que haya menos gente

                        for(int i=1;i<=10;i++){
                            if(mesas[i-1]==0){
                                ifs = false;
                                System.out.println("Por favor, siéntense en la mesa número "+ i);
                                mesas[i-1]=personas;
                                break;
                            }

                            //personas<=3 es para que si hubiera una persona en la mesa y hubiera 4 personas para sentarse
                            //se sumarian cinco y las mesas pueden como maximo 4 personas

                            if(mesas[i-1]==1 && personas<=3){
                                ifs = false;
                                System.out.println("Tendran que compartir mesa. Por favor, siéntense en la mesa número "+ i);
                                mesas[i-1]=personas+mesas[i-1];
                                break;
                            }
                            
                            if(mesas[i-1]==2 && personas<=2){
                                ifs = false;
                                System.out.println("Tendran que compartir mesa. Por favor, siéntense en la mesa número "+ i);
                                mesas[i-1]=personas+mesas[i-1];
                                break;
                            }
                            
                            if(mesas[i-1]==3 && personas<=1){
                                ifs = false;
                                System.out.println("Tendran que compartir mesa. Por favor, siéntense en la mesa número "+ i);
                                mesas[i-1]=personas+mesas[i-1];
                                break;
                            }
                            
                            
                        }
                        
                        //aqui usamos el boolean del principio

                        if(ifs){
                           System.out.println("Lo siento, en estos momentos no queda sitio.");     
                        }
                    } 
            }

        }while(seguir);

        sc.close();
        }
	}