### Main Activity `MainActivity.kt`

Simple activity using Kotlin where it initiates the UI and the util conversion classes in order to do the 
required conversion for either temperature or volume.

I have also added listeners to the EditText and Spinners for a better UX as the values will update at anytime 
one of the controls are interacted with.

### UI `activity_main.xml`, `include_temperature.xml`, `include_volume.xml`

Basic xml layout making use of `ConstraintLayout` and 'Guideline'.

I have seperated the temperature and volume child layouts out of the main layout using includes as this 
clears up the main layout and keeps each child layout logically seperated.

Also as a small touch I changed the theme to Blue and Green as this matches your website colours.

### Utils `utils/ConvertTemperatureJava` `utils/ConvertVolumeKotlin`
This contains the business logic for all the conversions. One class is done in Java and the Other in Kotlin 
just to showcase my ability to write in both.

Normally you would like to keep your codebase type consistent as it would be easier to work with and debug.

Each conversion class accepts an `inputValue`, `inputUnit` and `outputUnit`. 
You can then call the `.convert()` method and this will return your converted value.
If the class does not have all the required values it need to make the calculation a default of `0` will always be returned.

Example implementation (Java):
```
ConvertTemperatureJava convert = ConvertTemperatureJava()
convert.setInputUnit(TEMPERATURE_KELVIN)
convert.setInputValue("1")
convert.setOutputUnit(TEMPERATURE_CELSIUS)
float result = convert.convert()

(result: -272.15)
```

Adding more conversions to existing classes or even adding a new type of conversion should be fairly straight 
forward with the current modular approach.

### Unit Tests
There are a list of unit tests to test positives and negatives for each conversion 
class `utils/ConvertTemperatureJava` and `utils/ConvertVolumeKotlin`. 

It mainly focuses to test the logic of the two converstion classes.

It is divided into 4 groups:
- Check for same input types, if the input values are the same, do we get the expected result
- Test conversion positive and negatives for diffirent units
- Any other invalid inputs, missing values etc





