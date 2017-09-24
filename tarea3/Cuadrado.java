public class Cuadrado extends FiguraGeometrica implements Dibuja  {
    public Cuadrado(Integer alto) {
        super(alto);
    }

    public void dibuja () {
      for (int i = 0; i < alto; i++) {

          Piso p = new Piso(alto);
          p.imprimeC();
        }
  }
}
