public class TemperaturaAdapter extends TemperaturaFahrenheit {

    private ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public float recuperarTemperatura() {
        temperaturaCelsius.setTemperatura(
                (this.getTemperatura() - 32) * 5 / 9);

        return temperaturaCelsius.getTemperatura();
    }

    public void salvarTemperatura() {
        this.setTemperatura(
                temperaturaCelsius.getTemperatura() * 9 / 5 + 32);
    }
}