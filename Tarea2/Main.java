class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        int bloques = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 21);;
        Construccion e = new Construccion(bloques);
        for (int i = 0; i < bloques ; i++) {
            e.Espacio(i);
            e.Ladrillos(i);
            e.SaltoDeLinea();
        }

    }
}