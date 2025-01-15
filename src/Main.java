import Tenam.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //Ejercicio 1

        //ejercicio1(sc);

        //Ejercicio 2

        //ejercicio2(sc);

        //Ejercicio 3

        //ejercicio3(sc);

        //Ejercicio 4

        //ejercicio4(sc,ejercicio2(sc));

        //Ejercicio prueba

        //ejercicioPrueba(sc);

        //Ejercicio 5

        //ejercicio5(sc);

        //Ejercicio 6

        //ejercicio6(sc);

        //Ejercicio 7

        //ejercicio7(sc);
        //Ejercicio 8

        //ejercicio8(sc);

        //Ejercicio 9

        //ejercicio9(sc);

        //Ejercicio 10

        //ejercicio10(sc);

        //Ejercicio 11

        //ejercicio11(sc);

    }

    public static void ejercicio1(Scanner sc) {
        Empleado paco = new Empleado("Paco", "Romero", 567, "Controlsys");

        System.out.println("Los datos de este empleado son:\n" + paco);
        System.out.println("¿Es correcto?");
        String newname = sc.next();
        paco.setNombre(newname);
        System.out.println("Los datos de este empleado son:\n" + paco);
        System.out.println("Dime el apellido");
        String apellido2 = sc.next();
        System.out.println("Vas a cambiar " + paco.getApellidos() + " por " + apellido2);
        paco.setApellidos(apellido2);
        System.out.println("Los datos de este empleado son:\n" + paco);
    }

    public static Coche ejercicio2(Scanner sc) {
        Coche peugeot = new Coche("Peugeot", "308", 12200.00);


        System.out.println("Los datos del coche son:\n" + peugeot);
        System.out.println("A continuación, confirma o cambia la marca.");
        String nuevamarca = sc.next();
        peugeot.setMarca(nuevamarca);
        System.out.println("A continuación, confirma o cambia el modelo.");
        String nuevomodelo = sc.next();
        peugeot.setModelo(nuevomodelo);
        System.out.println("A continuación, confirma o cambia el precio.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double nuevoprecio = Double.valueOf(sc.next());
        peugeot.setPrecio(nuevoprecio);
        System.out.println("Actualizado");
        System.out.println("Los datos del coche son:\n" + peugeot);

        return peugeot;
    }

    public static void ejercicio3(Scanner sc) {
        Libro eragon = new Libro("Eragon", "Christopher Paolini", 19.99);
        System.out.println(eragon);
        System.out.println("Introduzca datos nuevos de ser necesario");
        System.out.println("A continuación, confirma o cambia el titulo.");
        String nuevotitulo = sc.next();
        eragon.setTitulo(nuevotitulo);
        System.out.println("A continuación, confirma o cambia el autor.");
        String nuevoautor = sc.next();
        eragon.setAutor(nuevoautor);
        System.out.println("A continuación, confirma o cambia el precio.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }

        Double nuevopreciolibro = Double.valueOf(sc.next());

        eragon.setPrecio(nuevopreciolibro);
        System.out.println("Actualizado");
        System.out.println(eragon);
    }

    public static void ejercicio4(Scanner sc, Coche peugeot) {
        System.out.println("Aplicar descuento. Recuerda que el formato es númerico");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double nuevodescuento = Double.valueOf(sc.next());
        peugeot.setDescuento(nuevodescuento);
        Double porcendescuento = nuevodescuento / 100;
        peugeot.setPrecio(peugeot.getPrecio() - (peugeot.getPrecio() * porcendescuento));

        System.out.println("Actualizado");
        System.out.println("Los datos del coche son:\n" + peugeot);
    }

    public static void ejercicioPrueba(Scanner sc) {
        Pruebaifelse uno = new Pruebaifelse(0.0);
        System.out.println("Empezamos con la prueba del if y el else");
        double nuevoprecioif = 0;
        double nuevodescuentoif = 0;
        System.out.println("Escriba un precio.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        nuevoprecioif = Double.valueOf(sc.next());

        System.out.println("Escriba un descuento.");

        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        nuevodescuentoif = Double.valueOf(sc.next());

        uno.setPrecio(nuevoprecioif);
        uno.setDescuento(nuevodescuentoif);
        System.out.println(uno);

        Double porcendescuentoif = nuevodescuentoif / 100;
        uno.setPrecio(uno.getPrecio() - (uno.getPrecio() * porcendescuentoif));

        System.out.println("El precio con descuento es " + uno.getPrecio());
    }

    public static void ejercicio5(Scanner sc) {
        System.out.println("Escriba el primer numero.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double primernumero = Double.valueOf(sc.next());

        System.out.println("Escriba el segundo numero.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double segundonumero = Double.valueOf(sc.next());

        // poniendo % entre los dos numero obtengo el valor del resto y no del coeficiente
        Double resto = primernumero % segundonumero;

        //Lo siguiente significa que resto igual al "double" 0, lo ha corregido el pregrama así.
        if (resto.equals((double) 0)) {
            System.out.println("El numero " + primernumero + " es divisible por " + segundonumero);

        } else {
            System.out.println("El numero " + primernumero + " no es divisible por " + segundonumero);
        }
    }
    public static void ejercicio6(Scanner sc) {
        System.out.println("Escriba el año para comprobar que es bisiesto.");
        while (!sc.hasNextBigInteger()) {
            System.out.println("El dato debe ser un año valido");
            sc.next();
        }
        Integer ano = Integer.valueOf(sc.next());
        Integer comprobante4 = ano%4;
        Integer comprobante100 = ano%100;
        Integer comprobante400 = ano%400;
        if (!comprobante4.equals((Integer) 0) || (!comprobante400.equals((Integer) 0) && comprobante100.equals((Integer) 0))){
            System.out.println("El año no es bisiesto");
        }else {
            System.out.println("El año es bisiesto");
        }

    }
    public static void ejercicio7(Scanner sc) {
        System.out.println("Escriba el primer numero.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double primernumero = Double.valueOf(sc.next());

        System.out.println("Escriba el segundo numero.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double segundonumero = Double.valueOf(sc.next());

        System.out.println("Escriba el tercer numero.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double tercernumero = Double.valueOf(sc.next());

        if ( primernumero>segundonumero && primernumero>tercernumero ){
            System.out.println("El numero mas alto es el primero: " + primernumero);
        }
        if ( segundonumero>primernumero && segundonumero>tercernumero ){
            System.out.println("El numero mas alto es el segundo: " + segundonumero);
        }
        if ( tercernumero>primernumero && tercernumero>segundonumero ){
            System.out.println("El numero mas alto es tercero: " + tercernumero);
        }

    }
    public static void ejercicio8(Scanner sc) {
        System.out.println("Escriba el primer numero.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double primernumero8 = Double.valueOf(sc.next());

        System.out.println("Escriba el operando.");

        while () {
            System.out.println("El dato debe ser +,-,* ó /");
            sc.next();
        }
        Double operando = Double.valueOf(sc.next());

        System.out.println("Escriba el segundo numero.");
        while (!sc.hasNextDouble()) {
            System.out.println("El dato debe ser numerico");
            sc.next();
        }
        Double segundonumero8 = Double.valueOf(sc.next());

    }
    public static void ejercicio9(Scanner sc) {

    }
    public static void ejercicio10(Scanner sc) {

    }
    public static void ejercicio11(Scanner sc) {

    }
}