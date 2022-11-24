/*
 * Ejercicio 9
 *Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 *cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
 *12 filas por 12 columnas y debe contener números generados al azar entre 0 y
 *100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
 *con los números convenientemente alineados.
 *
 * @author Antonio Luis Garcia
 */
public class Ejercicio30{
	public static void main(String[] args){
 
        int[][] cuadrado=new int[12][12];
        int[][] auxiliar=new int[12][12];
        int contador=0;

        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                cuadrado[i][j]=(int)(Math.random()*101);
            }
        }

        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                System.out.printf("%3d ",cuadrado[i][j]);
            }
            System.out.println();
        }

        //aqui cambiamos las posiciones

        for(int i=0;i<12;i++){

            contador /=11;

            for(int j=0;j<12;j++){
                if(contador==i){

                }else{
                    if(11-contador==i){

                    }else{
                        if(i<6){
                            auxiliar[i][j]=cuadrado[i][j-1];
                        }else{
                            
                        }
                    }
                }
                contador++;
            }
        }

        System.out.println();
        System.out.println();

        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                System.out.printf("%3d ",auxiliar[i][j]);
            }
            System.out.println();
        }
    
        }
	}