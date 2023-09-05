package prestamos;

public class Prestamo {
    private double monto;
    private TipoPrestamo tipo;
    private int plazoMeses;
    private double salarioSolicitante;

    public Prestamo(double monto, TipoPrestamo tipo, int plazoMeses, double salarioSolicitante) {
        this.monto = monto;
        this.tipo = tipo;
        this.plazoMeses = plazoMeses;
        this.salarioSolicitante = salarioSolicitante;
    }

    public double calcularCuotaMensual() {
        double tasaInteres;

        if (monto <= 5000000) {
            tasaInteres = tipo.getTasaMenor();
        } else {
            tasaInteres = tipo.getTasaMayor();
        }

        double cuotaMensual = (monto * tasaInteres) / (1 - Math.pow(1 + tasaInteres, -plazoMeses));

        if (cuotaMensual <= 0.35 * salarioSolicitante) {
            System.out.println("Préstamo preaprobado.");
            System.out.println("Cuota mensual a pagar: $" + cuotaMensual);
        } else {
            System.out.println("El préstamo no puede ser aprobado.");
            System.out.println("La cuota mensual de $" + cuotaMensual + " representa más del 35% del salario.");
        }

        return cuotaMensual;
    }
}
