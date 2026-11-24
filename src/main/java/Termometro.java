public class Termometro {

    private ITemperatura temperatura;
    private TemperaturaAdapter adapter;

    public Termometro() {
        temperatura = new TemperaturaCelsius();
        adapter = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(float valor) {
        temperatura.setTemperatura(valor);
        adapter.salvarTemperatura();
    }

    public float getTemperatura() {
        return adapter.recuperarTemperatura();
    }

    public float getTemperaturaFahrenheit() {
        return adapter.getTemperatura();
    }
}