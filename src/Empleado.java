public class Empleado {
    private String nombre;
    private String apellido;
    private Integer codigoDeEmpleado;
    private String nombredelaempresa;

    public Empleado(String nombre, String apellido, Integer codigoDeEmpleado, String nombredelaempresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeEmpleado = codigoDeEmpleado;
        this.nombredelaempresa = nombredelaempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCodigoDeEmpleado() {
        return codigoDeEmpleado;
    }

    public void setCodigoDeEmpleado(Integer codigoDeEmpleado) {
        this.codigoDeEmpleado = codigoDeEmpleado;
    }

    public String getNombredelaempresa() {
        return nombredelaempresa;
    }

    public void setNombredelaempresa(String nombredelaempresa) {
        this.nombredelaempresa = nombredelaempresa;
    }

    @Override
    public String toString() {
        return
                "\nNombre= " + nombre +
                        "\nApellido= " + apellido +
                        "\nCódigo del Empleado= " + codigoDeEmpleado +
                        "\nNombre de la Empresa= " + nombredelaempresa;
    }


}
