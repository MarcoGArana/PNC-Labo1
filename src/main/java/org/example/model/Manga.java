package org.example.model;

public class Manga {
    private String identificacion;
    private String nombre;
    private String autor;
    private String anio;
    private String estiloDibujo;
    private String genero;
    private String ambientacion;
    private Boolean estado;

    public Manga(String identificacion, String nombre, String autor, String anio, String estiloDibujo, String genero, String ambientacion, Boolean estado ) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.estiloDibujo = estiloDibujo;
        this.genero = genero;
        this.ambientacion = ambientacion;
        this.estado = estado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstiloDibujo() {
        return estiloDibujo;
    }

    public void setEstiloDibujo(String estiloDibujo) {
        this.estiloDibujo = estiloDibujo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAmbientacion() {
        return ambientacion;
    }

    public void setAmbientacion(String ambientacion) {
        this.ambientacion = ambientacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
