package Retos;
import java.util.Scanner;
public class Reto_4 
{
    /*Programa en java que le permita generar la simulación del juego piedra, papel o tijera */
    public static void main(String[] args) 
    {
        int eleccion;
        Scanner sc = new Scanner(System.in);
        int Aleatorio = (int)(Math.random() * 3) + 1;
		System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
		eleccion = sc.nextInt();
		switch (Aleatorio)
		{
			case 1:
				System.out.println("Piedra");
				switch (eleccion)
				{
					case 1: 
					System.out.println("Empate!"); 
					break;
					case 2: 
					System.out.println("Usted gana!"); 
					break;
					case 3: 
					System.out.println("La computadora gana!"); 
					break;
				}
				break;
			case 2:
				System.out.println("Papel");
				switch (eleccion)
				{
					case 1: 
					System.out.println("La computadora gana!"); 
					break;
					case 2: 
					System.out.println("Empate!"); 
					break;
					case 3: 
					System.out.println("Usted gana!"); 
					break;
				}
				break;
			case 3:
				System.out.println("Tijera");
				switch (eleccion)
				{
					case 1: 
					System.out.println("Usted gana!"); 
					break;
					case 2: 
					System.out.println("La computadora gana!"); 
					break;
					case 3: 
					System.out.println("Empate!"); 
					break;
				}
				break;
		}
        sc.close();
    }
}
