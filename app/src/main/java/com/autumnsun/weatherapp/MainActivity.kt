package com.autumnsun.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.autumnsun.weatherapp.adapter.WeatherAdapter
import com.autumnsun.weatherapp.adapter.WeatherData
import com.autumnsun.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var list: ArrayList<WeatherData>
    private lateinit var binding: ActivityMainBinding
    private lateinit var weatherAdapter: WeatherAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = getData()
        binding.recyclerView.adapter = WeatherAdapter(list)

    }


    private fun getData(): ArrayList<WeatherData> {
        return ArrayList<WeatherData>().apply {
            add(
                WeatherData(
                    "Rize",
                    "Türkiye",
                    "25 Ağustos",
                    R.raw.rainny
                )
            )
            add(
                WeatherData(
                    "İstanbul",
                    "Türkiye",
                    "25 Ağustos",
                    R.raw.sunny
                )
            )
            add(
                WeatherData(
                    "İzmir",
                    "Türkiye",
                    "25 Ağustos",
                    R.raw.rainny
                )
            )
        }
    }
}