abstract public class FiguraGeometrica {
    protected Integer alto;
    protected Integer ancho;

    public FiguraGeometrica(Integer alto, Integer ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    public FiguraGeometrica(Integer alto){
        this.alto = alto;
    }

    public Integer getAlto()
    {
        return alto;
    }
    public Integer getAncho()
    {
        return ancho;
    }
}
