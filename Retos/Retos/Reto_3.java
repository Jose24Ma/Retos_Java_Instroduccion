package Retos;
import java.util.Scanner;
import java.util.Random;
public class Reto_3 
{
    /*Programa que simule el juego del carisellazo */
    public static void main(String[] args) 
    {
        int eleccion;
        int moneda;
        Scanner sc = new Scanner(System.in);
        Random Aleatorio = new Random();
        moneda = Aleatorio.nextInt()%2;
        System.out.println("Eliga una opción: \nCara = 0 \nCruz = 1"+"\n---------------");
        eleccion = sc.nextInt();
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
        }
        sc.close();

    }
    
}
