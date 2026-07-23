package figuras;

public class Circulo implements FiguraGeometrica2D {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String getTipo() {
        return "Circulo";
    }

    @Override
public int compareTo(FiguraGeometrica2D outra) {
    return Double.compare(this.getArea(), outra.getArea());
}
}
