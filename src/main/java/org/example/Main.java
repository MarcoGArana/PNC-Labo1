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
                    //TODO
                    break;
                case 2:
                    //TODO
                    break;
                case 3:
                    //TODO
                    break;
                case 4:
                    //TODO
                    break;
                case 5:
                    //TODO
                    break;
                case 6:
                    //TODO
                    break;
                case 7:
                    //TODO
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while(option != 7);

        scan.close();
    }
}