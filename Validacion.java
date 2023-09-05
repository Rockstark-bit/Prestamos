package prestamos;

import java.util.Scanner;

public class Validacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese los datos para la persona " + i + ":");
            System.out.print("Monto del préstamo: $");
            double monto = scanner.nextDouble();

            System.out.print("Tipo de préstamo (1: Vivienda, 2: Educación, 3: Libre Inversión): ");
            int tipoPrestamo = scanner.nextInt();

            TipoPrestamo tipo = null;
            switch (tipoPrestamo) {
                case 1:
                    tipo = TipoPrestamo.VIVIENDA;
                    break;
                case 2:
                    tipo = TipoPrestamo.EDUCACION;
                    break;
                case 3:
                    tipo = TipoPrestamo.LIBRE_INVERSION;
                    break;
                default:
                    System.out.println("Tipo de préstamo no válido. Intente nuevamente.");
                    i--;
                    continue;
            }

            System.out.print("Plazo en meses: ");
            int plazoMeses = scanner.nextInt();

            System.out.print("Salario del solicitante: $");
            double salarioSolicitante = scanner.nextDouble();

            Prestamo prestamo = new Prestamo(monto, tipo, plazoMeses, salarioSolicitante);
            prestamo.calcularCuotaMensual();
        }

        scanner.close();
    }
}
