package com.home.home.bluelabunitconverter;

import com.home.home.bluelabunitconverter.util.ConvertTemperatureJava;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ConvertTemperatureJavaUnitTest {
    private static String TEMPERATURE_KELVIN = "kelvin";
    private static String TEMPERATURE_CELSIUS = "celsius";
    private static String TEMPERATURE_FAHRENHEIT = "fahrenheit";

    // check for same input types - start
    @Test
    public void convertKelvinToKelvin_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_KELVIN);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_KELVIN);

        assertEquals(1f, convert.convert());
    }

    @Test
    public void convertKelvinToKelvin_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_KELVIN);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_KELVIN);

        assertNotEquals(0f, convert.convert());
    }

    @Test
    public void convertCelsiusToCelsius_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_CELSIUS);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertEquals(1f, convert.convert());
    }

    @Test
    public void convertCelsiusToCelsius_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_CELSIUS);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertNotEquals(0f, convert.convert());
    }

    @Test
    public void convertFahrenheitToFahrenheit_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT);

        assertEquals(1f, convert.convert());
    }

    @Test
    public void convertFahrenheitToFahrenheit_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT);

        assertNotEquals(0f, convert.convert());
    }
    // check for same input types - end

    // kelvin and celsius - start
    @Test
    public void convertKelvinToCelsius_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_KELVIN);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertEquals(-272.15f, convert.convert());
    }

    @Test
    public void convertKelvinToCelsius_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_KELVIN);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertNotEquals(0f, convert.convert());
    }

    @Test
    public void convertCelsiusToKelvin_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_CELSIUS);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_KELVIN);

        assertEquals(274.15f, convert.convert());
    }

    @Test
    public void convertCelsiusToKelvin_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_CELSIUS);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_KELVIN);

        assertNotEquals(0f, convert.convert());
    }
    // kelvin and celsius - end

    // kelvin and fahrenheit - start
    @Test
    public void convertKelvinToFahrenheit_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_KELVIN);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT);

        assertEquals(-457.87003f, convert.convert());
    }

    @Test
    public void convertKelvinToFahrenheit_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_KELVIN);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT);

        assertNotEquals(0f, convert.convert());
    }

    @Test
    public void convertFahrenheitToKelvin_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_KELVIN);

        assertEquals(255.9278f, convert.convert());
    }

    @Test
    public void convertFahrenheitToKelvin_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_KELVIN);

        assertNotEquals(0f, convert.convert());
    }
    // kelvin and fahrenheit - end

    // celsius and fahrenheit - start
    @Test
    public void convertCelsiusToFahrenheit_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_CELSIUS);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT);

        assertEquals(33.8f, convert.convert());
    }

    @Test
    public void convertCelsiusToFahrenheit_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_CELSIUS);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT);

        assertNotEquals(0f, convert.convert());
    }

    @Test
    public void convertFahrenheitToCelsius_isCorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertEquals(-17.222223f, convert.convert());
    }

    @Test
    public void convertFahrenheitToCelsius_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertNotEquals(0f, convert.convert());
    }
    // celsius and fahrenheit - end

    // check for any other invalid inputs - start
    @Test
    public void noInputsOrOutputs_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();

        assertEquals(0f, convert.convert());
    }

    @Test
    public void noInputUnit_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputValue("1");
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertEquals(0f, convert.convert());
    }

    @Test
    public void noInputValue_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertEquals(0f, convert.convert());
    }

    @Test
    public void noOutputUnit_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);
        convert.setInputValue("1");

        assertEquals(0f, convert.convert());
    }

    @Test
    public void noInputs_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setOutputUnit(TEMPERATURE_CELSIUS);

        assertEquals(0f, convert.convert());
    }

    @Test
    public void noInputValueAndOutputUnit_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT);

        assertEquals(0f, convert.convert());
    }

    @Test
    public void noInputAndOutputUnits_isIncorrect() {
        ConvertTemperatureJava convert = new ConvertTemperatureJava();
        convert.setInputValue("1");

        assertEquals(0f, convert.convert());
    }
    // check for any other invalid inputs - end
}
