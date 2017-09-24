public class Piso {
    private Integer alto;
    private Integer ancho;

    public Piso(Integer alto) {
        this.alto = alto;
    }
    public Piso(Integer alto, Integer ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    void imprimeC(){
        for (int i = 0; i < alto ; i++) {
            System.out.printf("#");
        }
        System.out.printf("\n");
    }
    void imprimeT(){
        for(int i=0; i<alto-ancho; i++){
            System.out.printf("");
        }
        for(int i=0; i<ancho; i++){
            System.out.printf("#");
        }
        System.out.printf("\n");

    }
    void imprimeR(){
        for (int i = 0; i < ancho ; i++) {
            System.out.printf("#");
        }
        System.out.printf("\n");

    }

}
