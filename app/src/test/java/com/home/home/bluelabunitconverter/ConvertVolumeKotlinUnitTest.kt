package com.home.home.bluelabunitconverter

import com.home.home.bluelabunitconverter.util.ConvertVolumeKotlin
import junit.framework.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ConvertVolumeKotlinUnitTest {
    companion object {
        const val VOLUME_LITRE = "litre"
        const val VOLUME_MILLILITRE = "millilitre"
        const val VOLUME_US_GALLON = "us_gallon"
    }

    // check for same input types - start
    @Test
    fun convertLitreToLitre_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_LITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_LITRE)

        assertEquals(1f, convert.convert())
    }

    @Test
    fun convertLitreToLitre_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_LITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_LITRE)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertMillilitreToMillilitre_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_MILLILITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertEquals(1f, convert.convert())
    }

    @Test
    fun convertMillilitreToMillilitre_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_MILLILITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertUsGallonToUsGallon_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_US_GALLON)

        assertEquals(1f, convert.convert())
    }

    @Test
    fun convertUsGallonToUsGallon_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_US_GALLON)

        assertNotEquals(0f, convert.convert())
    }
    // check for same input types - end

    // litre and millilitre - start
    @Test
    fun convertLitreToMillilitre_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_LITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertEquals(1000f, convert.convert())
    }

    @Test
    fun convertLitreToMillilitre_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_LITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertMillilitreToLitre_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_MILLILITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_LITRE)

        assertEquals(0.001f, convert.convert())
    }

    @Test
    fun convertMillilitreToLitre_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_MILLILITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_LITRE)

        assertNotEquals(0f, convert.convert())
    }
    // litre and millilitre - end

    // litre and us_gallon - start
    @Test
    fun convertLitreToUsGallon_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_LITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_US_GALLON)

        assertEquals(0.26417205f, convert.convert())
    }

    @Test
    fun convertLitreToUsGallon_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_LITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_US_GALLON)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertUsGallonToLitre_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_LITRE)

        assertEquals(3.7854118f, convert.convert())
    }

    @Test
    fun convertUsGallonToLitre_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_LITRE)

        assertNotEquals(0f, convert.convert())
    }
    // litre and us_gallon - end

    // millilitre and us_gallon - start
    @Test
    fun convertMillilitreToUsGallon_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_MILLILITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_US_GALLON)

        assertEquals(0.00026417203f, convert.convert())
    }

    @Test
    fun convertMillilitreToUsGallon_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_MILLILITRE)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_US_GALLON)

        assertNotEquals(0f, convert.convert())
    }

    @Test
    fun convertUsGallonToMillilitre_isCorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertEquals(3785.4119f, convert.convert())
    }

    @Test
    fun convertUsGallonToMillilitre_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertNotEquals(0f, convert.convert())
    }
    // millilitre and us_gallon - end

    // check for any other invalid inputs - start
    @Test
    fun noInputsOrOutputs_isIncorrect() {
        val convert = ConvertVolumeKotlin()

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputUnit_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputValue("1")
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputValue_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noOutputUnit_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)
        convert.setInputValue("1")

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputs_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setOutputUnit(VOLUME_MILLILITRE)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputValueAndOutputUnit_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputUnit(VOLUME_US_GALLON)

        assertEquals(0f, convert.convert())
    }

    @Test
    fun noInputAndOutputUnits_isIncorrect() {
        val convert = ConvertVolumeKotlin()
        convert.setInputValue("1")

        assertEquals(0f, convert.convert())
    }
    // check for any other invalid inputs - end
}
