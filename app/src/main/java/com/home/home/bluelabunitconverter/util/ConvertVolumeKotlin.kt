package com.home.home.bluelabunitconverter.util

import android.util.Log

class ConvertVolumeKotlin {
    private var inputValue = 0f
    private var inputUnit: String? = null
    private var outputUnit: String? = null

    companion object {
        const val TAG = "ConvertVolumeKotlin"
        const val VOLUME_LITRE = "litre"
        const val VOLUME_MILLILITRE = "millilitre"
        const val VOLUME_US_GALLON = "us_gallon"
    }

    fun setInputValue(inputValueString: String) {
        // convert input to correct type
        try {
            this.inputValue = java.lang.Float.parseFloat(inputValueString)
        } catch (e: NumberFormatException) {
            Log.e(TAG, e.message)
            this.inputValue = 0f
        }
    }

    fun setInputUnit(inputUnit: String) {
        this.inputUnit = inputUnit
    }

    fun setOutputUnit(outputUnit: String) {
        this.outputUnit = outputUnit
    }

    fun convert(): Float {
        // same units, no conversion required
        if (inputUnit != null && outputUnit != null && inputValue != 0f) {
            if (inputUnit.equals(outputUnit, ignoreCase = true)) {
                return inputValue
            }

            // litre and millilitre
            if (inputUnit.equals(VOLUME_LITRE, ignoreCase = true)
                && outputUnit.equals(VOLUME_MILLILITRE, ignoreCase = true)
            ) {
                return litreToMillilitre(inputValue)
            }
            if (inputUnit.equals(VOLUME_MILLILITRE, ignoreCase = true)
                && outputUnit.equals(VOLUME_LITRE, ignoreCase = true)
            ) {
                return millilitreToLitre(inputValue)
            }

            // litre and us_gallon
            if (inputUnit.equals(VOLUME_LITRE, ignoreCase = true)
                && outputUnit.equals(VOLUME_US_GALLON, ignoreCase = true)
            ) {
                return litreToUsGallon(inputValue)
            }
            if (inputUnit.equals(VOLUME_US_GALLON, ignoreCase = true)
                && outputUnit.equals(VOLUME_LITRE, ignoreCase = true)
            ) {
                return usGallonToLitre(inputValue)
            }

            // millilitre and us_gallon
            if (inputUnit.equals(VOLUME_MILLILITRE, ignoreCase = true)
                && outputUnit.equals(VOLUME_US_GALLON, ignoreCase = true)
            ) {
                return millilitreToUsGallon(inputValue)
            }
            if (inputUnit.equals(VOLUME_US_GALLON, ignoreCase = true)
                && outputUnit.equals(VOLUME_MILLILITRE, ignoreCase = true)
            ) {
                return usGallonToMillilitre(inputValue)
            }
        }

        // fallback
        return 0f
    }

    private fun litreToMillilitre(input: Float): Float {
        return input * 1000f
    }

    private fun millilitreToLitre(input: Float): Float {
        return input / 1000f
    }

    private fun litreToUsGallon(input: Float): Float {
        return input * 0.26417205124156f
    }

    private fun usGallonToLitre(input: Float): Float {
        return input * 3.785411784f
    }

    private fun millilitreToUsGallon(input: Float): Float {
        return (input * 0.26417205124156f) / 1000
    }

    private fun usGallonToMillilitre(input: Float): Float {
        return (input * 3.785411784f) * 1000
    }
}
