package org.example.model;

public class LibroConvencional {

    private String identificacion;
    private String nombre;
    private String autor;
    private String anio;
    private String genero;
    private Boolean estado;

    public LibroConvencional(String identificacion, String nombre, String autor, String anio, String genero, Boolean estado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
