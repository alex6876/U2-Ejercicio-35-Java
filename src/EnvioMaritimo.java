
public class EnvioMaritimo extends EstrategiaEnvio {

    public EnvioMaritimo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesoKg, double distanciaKm) {
        if (pesoKg < 0 || distanciaKm < 0) {
            throw new IllegalArgumentException(
                    "El peso y la distancia no pueden ser negativos"
            );
        }

        return tarifaBase + (pesoKg * 1) + (distanciaKm * 0.8);
    }

}
