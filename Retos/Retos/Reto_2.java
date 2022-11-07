package Retos;

import java.util.Scanner;

public class Reto_2 
{
    /*Realice un programa en java que le permita a la enfermera, determinar con facilidad la dosis de la vacuna que se debe aplicar a un bebé */
    public static void main(String[] args) 
    {
        float dosis;
        int peso;
        int meses;

        Scanner lectura = new Scanner (System.in); 
            System.out.println("Ingrese el peso del bebe:");
            peso = lectura.nextInt();
            System.out.println("Ingrese los meses del bebe:");
            meses = lectura.nextInt();
            dosis = (peso + 10)/(meses * 10)*8;
            System.out.println("La dosis que se debe aplicar al bebe es de: "+ dosis);
        lectura.close();
    }
} 
