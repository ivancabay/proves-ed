package ud04;
import java.util.Arrays;
import java.util.Scanner;
public class EjercicioArrayOrdenada {
    public static void main(String[] args) {
        int izq=0;
        int vector[]=new int[100];
        int der=vector.length-1;
        int i=0;
        int numIntroducido;
        boolean encontrado = false;
        int numAleatorio=0;
        while(i<vector.length){
          numAleatorio += (int)((Math.random()*100)+1);
          vector[i] = numAleatorio;
          i++;
        }

        
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el número a buscar: ");
        numIntroducido = tec.nextInt();
        while (izq <= der && !encontrado){
            int m = (der+izq)/ 2;
            if (vector[m] == numIntroducido){
                encontrado = true;
            }else if (vector[m]> numIntroducido){
                der = m-1;
            }else{
                izq = m+1;
            }


        }
        if (encontrado == true){
            System.out.println("El número se encuentra en el vector.");
        }else System.out.println("El número no se encuentra en el vector");

        System.out.println("El vector era el siguiente: ");
        System.out.println(Arrays.toString(vector));




    }
}
