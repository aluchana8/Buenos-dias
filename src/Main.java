import javax.sound.sampled.AudioFileFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Empleado antonio = new Empleado("Antonio", "García", 897, "Apple");
        System.out.print("El empleado es:" + antonio);
        String nombre2 = sc.next();
        antonio.setNombre(nombre2);
        System.out.print("El empleado es:" + antonio);


        System.out.println(antonio.getApellido());
        Scanner sc = new Scanner(System.in);
        String prueba = sc.next();
        antonio.setApellido(prueba);
        System.out.println(antonio.getApellido());
        Coche audi = new Coche("Audi", "A5", 35000.500);
        System.out.println("Los datos del coche son:\n" + audi);
        Scanner sc = new Scanner(System.in);
        String marca2 = sc.next();
        audi.setMarca(marca2);
        String modelo2 = sc.next();
        audi.setModelo(modelo2);
        Double precio2 = sc.nextDouble();
        audi.setPrecio(precio2);
        System.out.println("Los datos del coche son:\n" + audi);
    }



}