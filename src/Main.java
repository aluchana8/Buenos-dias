import Tenam.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado paco = new Empleado("Paco","Romero", 567, "Controlsys");

        Scanner sc = new Scanner(System.in);

        System.out.println("Los datos de este empleado son:\n" + paco);
        System.out.println("¿Es correcto?");
        String newname = sc.next();
        paco.setNombre(newname);

        System.out.println("Los datos de este empleado son:\n" + paco);


    }
}