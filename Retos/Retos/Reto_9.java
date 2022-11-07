package Retos;

import java.util.Scanner;

public class Reto_9 
{
 public static void main(String[] args) 
 {
    Scanner leer = new Scanner(System.in);

    String[][]Productos = new String[4][4];
    int[][]Precio = new int[4][4];

    for(int fila=0;fila<4;fila++)
    {
        for(int columna=0;columna<4;columna++)
        {
            System.out.println("Ingrese el producto ");
            Productos[fila][columna]=leer.next();
            System.out.println("Ingrese el precio ");
            Precio[fila][columna]=leer.nextInt();
        }
    }
    System.out.println("-------------------------------------------------------------------");
    for(int fila=0;fila<4;fila++)
    {
        for(int columna=0;columna<4;columna++)
        {
        System.out.print(fila+""+columna+"   "+Productos[fila][columna]+" "+Precio[fila][columna]+"\t");
        }
        System.out.println("");
    }
    leer.close();
 }      
}
