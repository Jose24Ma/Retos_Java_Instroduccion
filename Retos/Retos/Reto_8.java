package Retos;
import java.util.Scanner;
public class Reto_8 
{
    public static void main(String[] args) 
    {
        int tiempoG = 100;
        Scanner leer = new Scanner(System.in);
         System.out.println("Cuantos competidores participarán");
         int n = leer.nextInt();
         String[]competidor = new String[n];
         int[]tiempos = new int[n];
         for(int i=0;i<competidor.length;i++)
         {
            System.out.println("Ingrese el nombre del competidor ");
            competidor[i]= leer.next();

            System.out.println("Ingrese el tiempo del competidor");
            tiempos[i]=leer.nextInt();
         }
         System.out.println("\nLista de competidores");
         for(int l = 0 ; l<competidor.length;l++)
         {
            System.out.println(l+1+"."+"El competidor "+competidor[l]+" tiene un tiempo de "+tiempos[l]);
         }
         System.out.println("\nGanador de la competeción");
            for(int x : tiempos)
            {  
               if(x <= tiempoG)
               {
                  System.out.println("El tiempo ganador fue de: "+x+" Seg."+competidor[x]);
               }
            }
         leer.close();
    }
}
