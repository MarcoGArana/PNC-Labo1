package org.example.repository;

import org.example.model.LibroConvencional;
import org.example.model.Manga;
import org.example.model.Periodico;
import org.example.model.Prestamo;

import java.util.List;

public class repositoryLibros {
    private List<LibroConvencional> librosConvencionales;
    private List<Periodico> librosPeriodico;
    private List<Manga> librosManga;
    private List<Prestamo> prestamos;

    public void listAll(){
        listLC();
        listManga();
        listPR();
    }

    public void listLC(){
        System.out.println("\n----------Libros Convencionales----------");
        String estado;
        for(LibroConvencional libro : librosConvencionales){
            estado = (true) ? "Prestado" : "Disponible";
            System.out.println("Titulo: ");
            System.out.println("Autor: ");
            System.out.println("Estado actual: " + estado);
        }
    }

    public void listPR(){
        System.out.println("\n----------Periodicos----------");
        String estado;
        for(Periodico libro : librosPeriodico){
            estado = (libro.isEstado()) ? "Prestado" : "Disponible";
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Estado actual: " + estado);
        }
    }

    public void listManga(){
        System.out.println("\n----------Mangas----------");
        String estado;
        for(Manga libro : librosManga){
            estado = (true) ? "Prestado" : "Disponible";
            System.out.println("Titulo: ");
            System.out.println("Autor: ");
            System.out.println("Estado actual: " + estado);
        }
    }
}
