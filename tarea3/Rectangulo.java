public class Rectangulo extends FiguraGeometrica implements Dibuja  {
    public Rectangulo(Integer alto, Integer ancho) {
        super(alto,ancho);
    }

    public void dibuja () {
        for (int i = 0; i < alto; i++) {

            Piso p = new Piso(alto,ancho);
            p.imprimeR();
        }
    }
}
