public class TemperaturaFahrenheit {

    private float temperatura;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        if (temperatura < -459.67f) {
            throw new IllegalArgumentException("Temperatura inválida");
        }
        this.temperatura = temperatura;
    }
}