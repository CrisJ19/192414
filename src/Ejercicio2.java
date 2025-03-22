import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Contador = 0;
        int aprobados = 0;
        while (Contador < 4) {
            System.out.println("Ingrese la primera nota: ");
        double Nota1 = scanner.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        double Nota2 = scanner.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        double Nota3 = scanner.nextDouble();
        double promedio = (Nota1 + Nota2 + Nota3) / 3;
        if (promedio >= 3) {
            
        System.out.println("Felicidades usted ha aprobado: " + promedio);
        aprobados = aprobados + 1;
        }else {
            System.out.println("Usted ha reprobado: " + promedio);
        }
        Contador = Contador + 1;
        }
        System.out.println("Estudiantes aprobados: " + aprobados);

        scanner.close();
    }
}


