class Construccion {
    private int bloques;
    protected Construccion(int bloques){
        this.bloques = bloques;
    }

    protected void Espacio(int fase) {
        for (int i = 0; i <bloques-1-fase ; i++) {
            System.out.printf(" ");
        }
    }
    protected void Ladrillos(int fase){
        for (int i = 0; i<fase+1 ; i++) {
            System.out.printf("#");
        }
    }
    protected void SaltoDeLinea(){
        System.out.printf("\n");
    }

}
