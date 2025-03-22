import java.util.Scanner;

public class BienHecho {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Contador = 0;

        System.out.println("Número de usuarios a ingresar:");
        int Nusuarios = scanner.nextInt();
        scanner.nextLine();

        int Edad1 = 0, Edad2 = 0, Edad3 = 0;
        String Nombre1 = "", Nombre2 = "", Nombre3 = "";

        while (Contador < Nusuarios) {
            System.out.println("Nombre del usuario:");
            String Nombre = scanner.nextLine();

            System.out.println("Edad del usuario:");
            int Edad = scanner.nextInt();
            scanner.nextLine();

            if (Contador == 0) {
                Nombre1 = Nombre;
                Edad1 = Edad;
            } else if (Contador == 1) {
                Nombre2 = Nombre;
                Edad2 = Edad;
            } else if (Contador == 2) {
                Nombre3 = Nombre;
                Edad3 = Edad;
            }

            if (Edad >= 18) {
                System.out.println(Nombre + " es mayor de edad.");
            } else {
                System.out.println(Nombre + " es menor de edad.");
            }

            if (Edad > 120 || Edad < 1) {
                System.out.println("Edad no válida.");
            }

            Contador = Contador + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + Nombre1 + " - Edad: " + Edad1);
        System.out.println("Usuario 2: " + Nombre2 + " - Edad: " + Edad2);
        System.out.println("Usuario 3: " + Nombre3 + " - Edad: " + Edad3);
        scanner.close();
    }
}
