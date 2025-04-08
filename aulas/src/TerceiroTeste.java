public class TerceiroTeste {
    public static void main(String[] args) {
        int pesoCarga = 900;
        int limitePeso = 1000;

        boolean cargaExcedida = pesoCarga <= limitePeso;
        //System.out.printf("Carga excedida: %b\n", cargaExcedida);

        if (cargaExcedida == true) {
            System.out.printf("Carga liberada %b\n", cargaExcedida);
        } else if (cargaExcedida == false) {
            System.out.printf("Carga retida %b\n", cargaExcedida);
        }
    }
}
