class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        Construccion e = new Construccion(java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 21));
        for (int i = 0; i < e.cantidad(); i++) {

            for(int j=0; j <e.espacios(i); j++) {
                System.out.printf(" ");
            }
            for(int j=0; j<e.ladrillo(i);j++) {
                System.out.printf("" + e.material());
            }
            e.SaltoDeLinea();

        }

    }
}