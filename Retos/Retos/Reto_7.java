package Retos;
import java.util.Scanner;
public class Reto_7 
{
    public static void main(String[] args) 
    {
         /*Arrays de notas con promedio*/
         int notaFinal =0;
         Scanner leer = new Scanner(System.in);
         System.out.println("Cuantas notas tiene el estudiante");
         int n = leer.nextInt();
         int[] notas = new int[n];
         for(int p=0;p<notas.length;p++)
         {
            System.out.println("Ingrese la nota numero "+p);
            notas[p]= leer.nextInt();
            notaFinal = notaFinal + notas[p];  
         }
         float promedio = notaFinal / notas.length;
            if(promedio < 3 )
            {
               System.out.println("Reprobaste");
            }
            else if(promedio >3 && promedio < 4.0 )
            {
               System.out.println("Pasaste Raspando");
            }
            else if(promedio >4.0)
            {
               System.out.println("Aprobaste con buenos resultados");
            }
       
         leer.close();
    }
}
