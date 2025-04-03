package org.example;

import org.example.model.LibroConvencional;


import java.util.Scanner;

public class agregarLibros {

    private void agregarLibro(){
        System.out.println("Que tipo de libro desea agregar?");
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        switch (tipo){
            case 1:
                //libro convencional
                break;
            case 2:
                //manga
                break;
            case 3:
                // periodico

        }
    }

    private void agregarLC(){
        System.out.println("Ingrese el nombre del libro");
        Scanner scNombre = new Scanner(System.in);
        String nombreLC = scNombre.nextLine();

        System.out.println("Ingrese el autor del libro");
        Scanner scAutor = new Scanner(System.in);
        String autorLC = scAutor.nextLine();

        System.out.println("Ingrese el anio del libro");
        Scanner scAnio = new Scanner(System.in);
        String anioLC = scAnio.nextLine();

        System.out.println("Ingrese el genero del libro");
        Scanner scGenero = new Scanner(System.in);
        String generoLC = scGenero.nextLine();

        LibroConvencional lc = new LibroConvencional("hi", nombreLC, autorLC, anioLC, generoLC,true);




    }

}
