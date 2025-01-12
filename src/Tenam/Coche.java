package Tenam;

public class Coche {
    private String marca;
    private String modelo;
    private Double precio;

    public Coche(String marca, String modelo, Double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche de" +
                " marca " + marca +
                ", modelo " + modelo +
                " y precio " + precio;
    }
}
