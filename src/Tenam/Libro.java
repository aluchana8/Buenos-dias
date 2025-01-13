package Tenam;

import java.security.PrivateKey;

public class Libro {
    private String titulo;
    private String autor;
    private Double precio;

    public Libro(String titulo, String autor, Double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El titulo del libro es " + titulo +
                " del autor " + autor +
                " y con un precio de " + precio;
    }
}
