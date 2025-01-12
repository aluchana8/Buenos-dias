import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado antonio = new Empleado("Antonio","García",897,"Apple");
        System.out.print("El empleado es:" + antonio);
        Scanner sc = new Scanner(System.in);
        String nombre2 = sc.next();
    }

}