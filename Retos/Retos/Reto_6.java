package Retos;
import java.util.Scanner;
import java.util.Random;
public class Reto_6 
{
    /*Programa que simule el juego del carisellazo con una estructura ciclica*/
    public static void main(String[] args) 
    {
        int i = 0;
        int dinero;
        int moneda;
        int eleccion;
        int restar =1000;
        int incremento =1000;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero para apostar");
        dinero = leer.nextInt();
        do 
        {
            Random Aleatorio = new Random();
            moneda = Aleatorio.nextInt()%2;
            System.out.println("Eliga una opción: \nCara = 0 \nCruz = 1");
            eleccion = leer.nextInt();
            if (eleccion==moneda) 
            {
                if(moneda==1)
                {
                    System.out.println("Gano Cruz '1'\n");
                }
                else if(moneda==0)
                {
                    System.out.println("Gano Cara '0'\n");
                }
                dinero += incremento;
            }   
            else 
            {
                if(moneda==1)
                {
                    System.out.println("Perdio Cruz '1'\n");
                }
                else if(moneda==0)
                {
                    System.out.println("Perdio Cara '0'\n");
                }
                dinero -= restar;
            }
            System.out.println("Acumulado hasta el momento: "+dinero+"\n");
            i++;

        }while(dinero != 0 || dinero == 10000);
        System.out.println("Total de veces jugado: " + i +"\n");
        System.out.println("Total acumulado: "+dinero+"\n");
        leer.close();
    }
}
