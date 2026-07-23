package figuras;

public class FigurasMain {
    public static void main(String[] args) {
        RepositorioDeFiguras2D repositorio = new RepositorioDeFiguras2D();

        repositorio.adicionaFigura(new Circulo(5));
        repositorio.adicionaFigura(new Quadrado(4));

        System.out.println(repositorio.getTipo(0) + " - Área: " + repositorio.getArea(0) + " - Perímetro: " + repositorio.getPerimetro(0));
        System.out.println(repositorio.getTipo(1) + " - Área: " + repositorio.getArea(1) + " - Perímetro: " + repositorio.getPerimetro(1));
    }
}
