public class Triangulo extends FiguraGeometrica implements Dibuja  {
    public Triangulo(Integer alto) {
        super(alto);
    }

    public void dibuja () {
        for (int i = 0; i < alto; i++) {
            Piso p = new Piso(alto, i+1);
            p.imprimeT();
        }
    }
}
