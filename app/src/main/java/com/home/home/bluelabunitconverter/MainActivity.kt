package com.home.home.bluelabunitconverter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatEditText
import android.support.v7.widget.AppCompatSpinner
import android.support.v7.widget.AppCompatTextView
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import com.home.home.bluelabunitconverter.util.ConvertTemperatureJava
import com.home.home.bluelabunitconverter.util.ConvertVolumeKotlin

class MainActivity : AppCompatActivity() {
    private lateinit var convertTemperatureJava: ConvertTemperatureJava
    private lateinit var convertVolumeKotlin: ConvertVolumeKotlin

    // temperature
    private lateinit var temperatureArray: Array<String>
    private lateinit var temperatureInputSpinner: AppCompatSpinner
    private lateinit var temperatureOutputSpinner: AppCompatSpinner
    private lateinit var temperatureInputValue: AppCompatEditText
    private lateinit var temperatureOutputValue: AppCompatTextView

    // volume
    private lateinit var volumeArray: Array<String>
    private lateinit var volumeInputSpinner: AppCompatSpinner
    private lateinit var volumeOutputSpinner: AppCompatSpinner
    private lateinit var volumeInputValue: AppCompatEditText
    private lateinit var volumeOutputValue: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // data
        temperatureArray = resources.getStringArray(R.array.temperature)
        volumeArray = resources.getStringArray(R.array.volume)

        // init conversion classes
        convertTemperatureJava = ConvertTemperatureJava()
        convertVolumeKotlin = ConvertVolumeKotlin()

        // init ui
        initUiTemperature()
        initUiVolume()
    }

    private fun initUiTemperature() {
        // not using MVVM here as this is a simple conversion demonstration with the emphasis on the conversion logic
        temperatureInputSpinner = findViewById(R.id.temperature_input_spinner)
        temperatureInputValue = findViewById(R.id.temperature_input_value)
        temperatureOutputSpinner = findViewById(R.id.temperature_output_spinner)
        temperatureOutputValue = findViewById(R.id.temperature_output_value)

        // listeners
        temperatureInputValue.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                getInputAndOutputDataTemperature()
            }
        })

        temperatureInputSpinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                getInputAndOutputDataTemperature()
            }
        })
        temperatureOutputSpinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                getInputAndOutputDataTemperature()
            }
        })
    }

    private fun initUiVolume() {
        // not using MVVM here as this is a simple conversion demonstration with the emphasis on the conversion logic
        volumeInputSpinner = findViewById(R.id.volume_input_spinner)
        volumeInputValue = findViewById(R.id.volume_input_value)
        volumeOutputSpinner = findViewById(R.id.volume_output_spinner)
        volumeOutputValue = findViewById(R.id.volume_output_value)

        // listeners
        volumeInputValue.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                getInputAndOutputDataVolume()
            }
        })

        volumeInputSpinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                getInputAndOutputDataVolume()
            }
        })
        volumeOutputSpinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                getInputAndOutputDataVolume()
            }
        })
    }

    fun getInputAndOutputDataTemperature() {
        val inputPosition: Int = temperatureInputSpinner.selectedItemPosition
        convertTemperatureJava.setInputUnit(temperatureArray[inputPosition])

        val outputPosition: Int = temperatureOutputSpinner.selectedItemPosition
        convertTemperatureJava.setOutputUnit(temperatureArray[outputPosition])

        // check if we have an input value
        convertTemperatureJava.setInputValue(temperatureInputValue.text.toString())
        // check if we have enough data for conversion
        temperatureOutputValue.text = convertTemperatureJava.convert().toString()
    }

    fun getInputAndOutputDataVolume() {
        val inputPosition: Int = volumeInputSpinner.selectedItemPosition
        convertVolumeKotlin.setInputUnit(volumeArray[inputPosition])

        val outputPosition: Int = volumeOutputSpinner.selectedItemPosition
        convertVolumeKotlin.setOutputUnit(volumeArray[outputPosition])

        // check if we have an input value
        convertVolumeKotlin.setInputValue(volumeInputValue.text.toString())
        // check if we have enough data for conversion
        volumeOutputValue.text = convertVolumeKotlin.convert().toString()
    }
}


