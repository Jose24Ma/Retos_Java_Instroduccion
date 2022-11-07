package Retos;

import java.util.Scanner;

public class Reto_5 
{
    /*Programa para comprar n cantidad de productos en una tienda*/
    public static void main(String[] args) 
    {
        int productos;
        int precio;
        int totalcompra =0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos a comprar:");
        productos = leer.nextInt();
        
        for(int i=0;i<productos;i++)
        {
            System.out.println("Ingrese el precio del producto");
            precio = leer.nextInt();

            totalcompra += precio;
        }
        System.out.println("Total de la compra es = " + totalcompra);
        leer.close();
    }
}
