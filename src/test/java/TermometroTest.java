import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {

    @Test
    void deveRetornarTemperaturaCelsius() {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(25);

        assertEquals(25.0f, termometro.getTemperatura(), 0.01f);
    }

    @Test
    void deveConverterParaFahrenheit() {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(100);

        assertEquals(212.0f,
                termometro.getTemperaturaFahrenheit(), 0.01f);
    }

    @Test
    void deveConverterParaCelsius() {
        TemperaturaAdapter adapter =
                new TemperaturaAdapter(new TemperaturaCelsius());

        adapter.setTemperatura(68);

        assertEquals(20.0f, adapter.recuperarTemperatura(), 0.01f);
    }

    @Test
    void deveRetornarExcecaoTemperaturaCelsiusInvalida() {
        try {
            Termometro termometro = new Termometro();
            termometro.setTemperatura(-300);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Temperatura inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTemperaturaFahrenheitInvalida() {
        try {
            TemperaturaFahrenheit temperatura =
                    new TemperaturaFahrenheit();

            temperatura.setTemperatura(-500);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Temperatura inválida", e.getMessage());
        }
    }
}