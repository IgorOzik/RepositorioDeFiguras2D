package figuras;

public class Quadrado implements FiguraGeometrica2D {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getTipo() {
        return "Quadrado";
    }
}
