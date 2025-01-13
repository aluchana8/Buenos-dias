import Tenam.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1

        //Empleado paco = new Empleado("Paco","Romero", 567, "Controlsys");
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Los datos de este empleado son:\n" + paco);
        //System.out.println("¿Es correcto?");
        //String newname = sc.next();
        //paco.setNombre(newname);
        //System.out.println("Los datos de este empleado son:\n" + paco);
        //System.out.println("Dime el apellido");
        //String apellido2 = sc.next();
        //System.out.println("Vas a cambiar " + paco.getApellidos() + " por " + apellido2 );
        //paco.setApellidos(apellido2);
        //System.out.println("Los datos de este empleado son:\n" + paco);

        //Ejercicio 2

        Coche peugeot = new Coche("Peugeot","308", 12200.00);
        Scanner sc = new Scanner(System.in);

        System.out.println("Los datos del coche son:\n" + peugeot);
        System.out.println("A continuación, confirma o cambia la marca.");
        String nuevamarca = sc.next();
        peugeot.setMarca(nuevamarca);
        System.out.println("A continuación, confirma o cambia el modelo.");
        String nuevomodelo = sc.next();
        peugeot.setModelo(nuevomodelo);
        System.out.println("A continuación, confirma o cambia el precio.\nRecuerda que el formato es númerico");
        Double nuevoprecio = Double.valueOf(sc.next());
        peugeot.setPrecio(nuevoprecio);
        System.out.println("Actualizado");
        System.out.println("Los datos del coche son:\n" + peugeot);

        //Ejercicio 3

        //Libro eragon = new Libro("Eragon","Christopher Paolini", 19.99);
        //Scanner sc = new Scanner(System.in);
        //System.out.println(eragon);
        //System.out.println("Introduzca datos nuevos de ser necesario");
        //System.out.println("A continuación, confirma o cambia el titulo.");
        //String nuevotitulo = sc.next();
        //eragon.setTitulo(nuevotitulo);
        //System.out.println("A continuación, confirma o cambia el autor.");
        //String nuevoautor = sc.next();
        //ragon.setAutor(nuevoautor);
        //System.out.println("A continuación, confirma o cambia el precio.\\nRecuerda que el formato es númerico");
        //Double nuevopreciolibro = Double.valueOf(sc.next());
        //eragon.setPrecio(nuevopreciolibro);
        //System.out.println("Actualizado");
        //System.out.println(eragon);

        //Ejercicio 4

        System.out.println("Aplicar descuento. Recuerda que el formato es númerico");
        Double nuevodescuento = Double.valueOf(sc.next());
        peugeot.setDescuento(nuevodescuento);
        Double porcendescuento = nuevodescuento / 100;
        peugeot.setPrecio(peugeot.getPrecio() - (peugeot.getPrecio() * porcendescuento));

        System.out.println("Actualizado");
        System.out.println("Los datos del coche son:\n" + peugeot);
    }
}