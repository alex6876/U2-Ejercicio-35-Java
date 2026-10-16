import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<EstrategiaEnvio> envios = new ArrayList<>();

        envios.add(new EnvioEstandar(1000));
        envios.add(new EnvioExpresoAereo(2500));
        envios.add(new EnvioMaritimo(1500));

        double pesoKg = 10;
        double distanciaKm = 100;

        for (EstrategiaEnvio envio : envios) {
            double costo = envio.calcularCosto(pesoKg, distanciaKm);

            System.out.println("Costo del envío: $" + costo);
        }

    }

}
