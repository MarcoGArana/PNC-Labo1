package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            option = scan.nextInt();

            switch (option){
                case 1:
                    //TODO insercion
                    break;
                case 2:
                    //TODO list all
                    break;
                case 3:
                    //TODO list prestados
                    break;
                case 4:
                    //TODO list disponibles
                    break;
                case 5:
                    //TODO prestar
                    break;
                case 6:
                    //TODO ver detalle
                    break;
                case 7:
                    //TODO salir
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while(option != 7);

        scan.close();
    }
}