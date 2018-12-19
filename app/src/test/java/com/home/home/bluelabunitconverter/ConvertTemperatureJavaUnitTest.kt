package com.home.home.bluelabunitconverter

import com.home.home.bluelabunitconverter.util.ConvertTemperatureJava
import junit.framework.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ConvertTemperatureJavaUnitTest {
    companion object {
        const val TEMPERATURE_KELVIN = "kelvin"
        const val TEMPERATURE_CELSIUS = "celsius"
        const val TEMPERATURE_FAHRENHEIT = "fahrenheit"
    }

    // check for same input types - start
    @Test
    fun convertKelvinToKelvin_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_KELVIN)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_KELVIN)

        Assert.assertEquals(1f, convert.convert())
    }

    @Test
    fun convertKelvinToKelvin_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_KELVIN)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_KELVIN)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertCelsiusToCelsius_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_CELSIUS)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        Assert.assertEquals(1f, convert.convert())
    }

    @Test
    fun convertCelsiusToCelsius_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_CELSIUS)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertFahrenheitToFahrenheit_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT)

        Assert.assertEquals(1f, convert.convert())
    }

    @Test
    fun convertFahrenheitToFahrenheit_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT)

        assertNotEquals(0f, convert.convert())
    }
    // check for same input types - end

    // kelvin and celsius - start
    @Test
    fun convertKelvinToCelsius_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_KELVIN)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertEquals(-272.15f, convert.convert())
    }

    @Test
    fun convertKelvinToCelsius_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_KELVIN)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertCelsiusToKelvin_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_CELSIUS)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_KELVIN)

        assertEquals(274.15f, convert.convert())
    }

    @Test
    fun convertCelsiusToKelvin_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_CELSIUS)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_KELVIN)

        assertNotEquals(0f, convert.convert())
    }
    // kelvin and celsius - end

    // kelvin and fahrenheit - start
    @Test
    fun convertKelvinToFahrenheit_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_KELVIN)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT)

        assertEquals(-457.87003f, convert.convert())
    }

    @Test
    fun convertKelvinToFahrenheit_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_KELVIN)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertFahrenheitToKelvin_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_KELVIN)

        assertEquals(255.9278f, convert.convert())
    }

    @Test
    fun convertFahrenheitToKelvin_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_KELVIN)

        assertNotEquals(0f, convert.convert())
    }
    // kelvin and fahrenheit - end

    // celsius and fahrenheit - start
    @Test
    fun convertCelsiusToFahrenheit_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_CELSIUS)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT)

        assertEquals(33.8f, convert.convert())
    }

    @Test
    fun convertCelsiusToFahrenheit_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_CELSIUS)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_FAHRENHEIT)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertFahrenheitToCelsius_isCorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertEquals(-17.222223f, convert.convert())
    }

    @Test
    fun convertFahrenheitToCelsius_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertNotEquals(0f, convert.convert())
    }
    // celsius and fahrenheit - end

    // check for any other invalid inputs - start
    @Test
    fun noInputsOrOutputs_isIncorrect() {
        val convert = ConvertTemperatureJava()

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputUnit_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputValue("1")
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputValue_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noOutputUnit_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)
        convert.setInputValue("1")

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputs_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setOutputUnit(TEMPERATURE_CELSIUS)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputValueAndOutputUnit_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputUnit(TEMPERATURE_FAHRENHEIT)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputAndOutputUnits_isIncorrect() {
        val convert = ConvertTemperatureJava()
        convert.setInputValue("1")

        assertEquals(0f, convert.convert())
    }
    // check for any other invalid inputs - end
}
