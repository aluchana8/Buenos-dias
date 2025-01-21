import javax.sound.sampled.AudioFileFormat;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        /*Empleado antonio = new Empleado("Antonio", "García", 897, "Apple");
        System.out.print("El empleado es:" + antonio);
        String nombre2 = sc.next();
        antonio.setNombre(nombre2);
        System.out.print("El empleado es:" + antonio);
        System.out.println(antonio.getApellido());
        String prueba = sc.next();
        antonio.setApellido(prueba);
        System.out.println(antonio.getApellido());
        Coche audi = new Coche("Audi", "A5", 35000.500);
        System.out.println("Los datos del coche son:\n" + audi);
        //String marca2 = sc.next();
        //audi.setMarca(marca2);
        //String modelo2 = sc.next();
        //audi.setModelo(modelo2);
        //Double precio2 = sc.nextDouble();
        //audi.setPrecio(precio2);
        //System.out.println("Los datos del coche son:\n" + audi);
        System.out.println("¿Qué descuento quieres?");
        Double descuento = sc.nextDouble();
        audi.aplicarDescuento(descuento);
        System.out.println("El nuevo precio es:\n" + audi.getPrecio());

         */
        //ejercicio5(sc);
        //ejercicio6(sc);
        //ejercicio7(sc);
        ejercicio8(sc);
    }

    public static void ejercicio5(Scanner sc) {
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        //b%a==0
        if (b % a == 0) {
            System.out.println("El número " + b + "es divisible del número " + a);
        } else {
            //b%a!=0
            System.out.println("El número " + b + " no es divisible del número " + a);
        }


    }

    public static void ejercicio6(Scanner sc) {
        Integer a = sc.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public static void ejercicio7(Scanner sc) {
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("El número mayor es " + a);
        } else if (b > a && b > c) {
            System.out.println("El número mayor es " + b);
        } else {
            System.out.println("El número mayor es " + c);
        }

    }
    public static void ejercicio8(Scanner sc) {
        while (true) {

            Boolean condicion = true;
            System.out.println("Introduzca el primer número: ");

            while (!sc.hasNextDouble()) {
                System.out.println("Debe de ser un número. Introduzcalo de nuevo: ");
                sc.next();
            }
            Double a = sc.nextDouble();

            System.out.println("Introduzca el operador: ");

            String operador = sc.next();
            while (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")) {
                System.out.println("Debe de ser o un (+), un (-), un (*), o una (/). ");
                operador = sc.next();
            }

            System.out.println("Introduzca el segundo número: ");

            while (!sc.hasNextDouble()) {
                System.out.println("Debe de ser un número. Introduzcalo de nuevo: ");
                sc.next();
            }
            Double b = sc.nextDouble();
            //for (int i=0;a=) {


            Double resultado;

            if (operador.equals("+")) {
                resultado = a + b;
            } else if (operador.equals("-")) {
                resultado = a - b;

            } else if (operador.equals("*")) {
                resultado = a * b;

            } else {
                resultado = a / b;

            }

            System.out.println("El resultado de su operación es = " + resultado + "\n");

        }
    }




}