package prestamos;

public enum TipoPrestamo {
    VIVIENDA(0.006, 0.008),
    EDUCACION(0.005, 0.0065),
    LIBRE_INVERSION(0.012, 0.014);

    private final double tasaMenor;
    private final double tasaMayor;

    TipoPrestamo(double tasaMenor, double tasaMayor) {
        this.tasaMenor = tasaMenor;
        this.tasaMayor = tasaMayor;
    }

    public double getTasaMenor() {
        return tasaMenor;
    }

    public double getTasaMayor() {
        return tasaMayor;
    }
}
