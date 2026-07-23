package figuras;

public interface FiguraGeometrica2D extends Comparable<FiguraGeometrica2D> {
    double getArea();
    double getPerimetro();
    String getTipo();
}
