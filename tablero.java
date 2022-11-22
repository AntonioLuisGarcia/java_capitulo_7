/*Crear un tablero de ajedrez
 * 
 * @author Antonio Luis Garcia
 */
import java.util.Scanner;
public class tablero{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga la anchura de la matriz");
        int ancho=sc.nextInt();
        int casilla=0;
        int[][] matriz=new int[ancho][ancho];
        for(int i=0;i<ancho;i++){
            for(int j=0;j<ancho;j++){
                if(casilla%2==0){
                    matriz[i][j]=1;
                }else{     
                        matriz[i][j]=0;
                }

            casilla++;
            }
            casilla--;
        } 
 
        for(int i=0;i<ancho;i++){
            for(int j=0;j<ancho;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}