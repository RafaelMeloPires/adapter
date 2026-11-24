public class TemperaturaCelsius implements ITemperatura {

    private float temperatura;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        if (temperatura < -273.15f) {
            throw new IllegalArgumentException("Temperatura inválida");
        }
        this.temperatura = temperatura;
    }
}