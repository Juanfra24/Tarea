class Construccion {
    private int cantidad;
    protected  Construccion(int cantidad){
        this.cantidad=cantidad;
    }
    protected int cantidad(){
        return cantidad;
    }
    protected char material(){
        return 'o';
    }
    protected int espacios(int fase){
        return cantidad-fase;
    }
    protected int ladrillo(int fase){
        return fase+1;
    }
    protected void SaltoDeLinea(){
        System.out.printf("\n");
    }

}
