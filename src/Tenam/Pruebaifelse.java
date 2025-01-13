package Tenam;

public class Pruebaifelse {
    private Double Precio;
    private Double Descuento;

    public Pruebaifelse(Double Precio){
        this.Precio = Precio;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Double getDescuento() {
        return Descuento;
    }

    public void setDescuento(Double descuento) {
        Descuento = descuento;
    }

    @Override
    public String toString() {
        return "La prueba sale que el precio es " + Precio + " y el descuento es " + Descuento;

    }
}
