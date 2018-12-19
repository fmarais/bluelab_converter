package com.home.home.bluelabunitconverter.util;

import android.util.Log;

public class ConvertTemperatureJava {
    private static final String TAG = "ConvertTemperatureJava";

    static String TEMPERATURE_KELVIN = "kelvin";
    static String TEMPERATURE_CELCIUS = "celsius";
    static String TEMPERATURE_FAHRENHEIT = "fahrenheit";

    private float inputValue = 0;
    private String inputUnit, outputUnit = null;

    public void setInputValue(String inputValueString) {
        // convert input to correct type
        try {
            this.inputValue = Float.parseFloat(inputValueString);
        } catch (NumberFormatException e) {
            Log.e(TAG, e.getMessage());
            this.inputValue = 0;
        }
    }

    public void setInputUnit(String inputUnit) {
        this.inputUnit = inputUnit;
    }

    public void setOutputUnit(String outputUnit) {
        this.outputUnit = outputUnit;
    }

    public float convert() {
        // same units, no conversion required
        if (inputUnit != null && outputUnit != null && inputValue != 0) {
            if (inputUnit.equalsIgnoreCase(outputUnit)) {
                return inputValue;
            }

            // kelvin and celsius
            if (inputUnit.equalsIgnoreCase(TEMPERATURE_KELVIN) && outputUnit.equalsIgnoreCase(TEMPERATURE_CELCIUS)) {
                return kelvinToCelsius(inputValue);
            }
            if (inputUnit.equalsIgnoreCase(TEMPERATURE_CELCIUS) && outputUnit.equalsIgnoreCase(TEMPERATURE_KELVIN)) {
                return celsiusToKelvin(inputValue);
            }

            // kelvin and fahrenheit
            if (inputUnit.equalsIgnoreCase(TEMPERATURE_KELVIN) && outputUnit.equalsIgnoreCase(TEMPERATURE_FAHRENHEIT)) {
                return kelvinToFahrenheit(inputValue);
            }
            if (inputUnit.equalsIgnoreCase(TEMPERATURE_FAHRENHEIT) && outputUnit.equalsIgnoreCase(TEMPERATURE_KELVIN)) {
                return fahrenheitToKelvin(inputValue);
            }

            // celsius and fahrenheit
            if (inputUnit.equalsIgnoreCase(TEMPERATURE_CELCIUS) && outputUnit.equalsIgnoreCase(TEMPERATURE_FAHRENHEIT)) {
                return celsiusToFahrenheit(inputValue);
            }
            if (inputUnit.equalsIgnoreCase(TEMPERATURE_FAHRENHEIT) && outputUnit.equalsIgnoreCase(TEMPERATURE_CELCIUS)) {
                return fahrenheitToCelsius(inputValue);
            }
        }

        // fallback
        return 0;
    }

    private float kelvinToCelsius(float input) {
        return input - 273.15f;
    }

    private float celsiusToKelvin(float input) {
        return input + 273.15f;
    }

    private float kelvinToFahrenheit(float input) {
        return (input * 1.8f) - 459.67f;
    }

    private float fahrenheitToKelvin(float input) {
        return (input + 459.67f) * (5f / 9f);
    }

    private float celsiusToFahrenheit(float input) {
        return (input * 1.8f) + 32f;
    }

    private float fahrenheitToCelsius(float input) {
        return (input - 32f) / 1.8f;
    }
}
