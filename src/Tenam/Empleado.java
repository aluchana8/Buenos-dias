package Tenam;

public class Empleado {
    private String nombre;
    private String apellidos;
    private Integer codigo;
    private String empresa;

    public Empleado(String nombre, String apellidos, Integer codigo, String empresa){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empleado= " + nombre + "\s" + apellidos +
                "\nCodigo= " + codigo +
                "\nEmpresa= " + empresa;
    }
}




