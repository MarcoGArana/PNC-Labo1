package org.example.model;

public class Periodico {
    private String identificacion;
    private String titulo;
    private String autor;
    private String anio;
    private String estiloPapel;
    private String genero;
    private Integer numeroHojas;

    public Periodico(String identificacion, String titulo, String autor, String anio, String estiloPapel, String genero, Integer numeroHojas) {
        this.identificacion = identificacion;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.estiloPapel = estiloPapel;
        this.genero = genero;
        this.numeroHojas = numeroHojas;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEstiloPapel() {
        return estiloPapel;
    }

    public void setEstiloPapel(String estiloPapel) {
        this.estiloPapel = estiloPapel;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(Integer numeroHojas) {
        this.numeroHojas = numeroHojas;
    }
}
