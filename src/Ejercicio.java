import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        int nota3 = scanner.nextInt();
        double promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 3) {
            System.out.println("Felicidades el estudiante a aprobado: " + promedio);
        } else if (promedio < 3) {
            System.out.println("El estudiante ha reprobado");
        }
scanner.close();
    }
}
