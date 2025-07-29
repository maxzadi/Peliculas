public class Main {
    public static void main(String[] args) {
        Asiento asiento1 = new Asiento("A1");
        Asiento asiento2 = new Asiento("A2", true, "ocupado");

        System.out.println("Código del asiento 1: " + asiento1.mostrarCodigo());
        System.out.println("Código del asiento 2: " + asiento2.mostrarCodigo());

        asiento1.sentarse();

        asiento1.levantarse();

        asiento1.sentarse("Diego");

        asiento1.levantarse("Diego");

        asiento2.cambiarEstado("reservado");
    }
}

