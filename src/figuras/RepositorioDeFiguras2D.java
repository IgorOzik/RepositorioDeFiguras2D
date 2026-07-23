package figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RepositorioDeFiguras2D {
public void ordenaPorArea() {
    Collections.sort(figuras);
    
    private List<FiguraGeometrica2D> figuras = new ArrayList<>();

    public boolean adicionaFigura(FiguraGeometrica2D figura) {
        return figuras.add(figura);
    }

    public FiguraGeometrica2D removeFigura(int posicao) {
        return figuras.remove(posicao);
    }

    public double getArea(int posicao) {
        return figuras.get(posicao).getArea(); // chamada polimórfica
    }

    public double getPerimetro(int posicao) {
        return figuras.get(posicao).getPerimetro(); // chamada polimórfica
    }

    public String getTipo(int posicao) {
        return figuras.get(posicao).getTipo(); // chamada polimórfica
    }
}
