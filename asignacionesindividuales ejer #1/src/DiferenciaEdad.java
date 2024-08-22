import java.util.Scanner;

public class DiferenciaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los años de nacimiento de las dos personas
        System.out.print("Ingrese el año de nacimiento de la primera persona: ");
        int año1 = scanner.nextInt();
        System.out.print("Ingrese el año de nacimiento de la segunda persona: ");
        int año2 = scanner.nextInt();

        // Calcular y mostrar la diferencia de edad y quién es mayor
        int diferencia = Math.abs(año1 - año2);
        if (año1 < año2) {
            System.out.printf("La primera persona es mayor que la segunda persona. La diferencia de edad es: %d años.%n", diferencia);
        } else if (año1 > año2) {
            System.out.printf("La segunda persona es mayor que la primera persona. La diferencia de edad es: %d años.%n", diferencia);
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }

        scanner.close();
    }
}
