package com.autumnsun.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.autumnsun.weatherapp.adapter.DayData
import com.autumnsun.weatherapp.adapter.WeatherAdapter
import com.autumnsun.weatherapp.adapter.WeatherData
import com.autumnsun.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var list: ArrayList<WeatherData>
    private lateinit var secondList: ArrayList<DayData>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = getData()
        secondList = secondData()
        binding.recyclerView.adapter = WeatherAdapter(list, secondList)
        LinearSnapHelper().attachToRecyclerView(binding.recyclerView)

    }


    private fun secondData(): ArrayList<DayData> {
        return ArrayList<DayData>().apply {
            add(
                DayData(
                    "10:00", R.drawable.ic_sun, "20"
                )
            )
            add(
                DayData(
                    "11:00", R.drawable.ic_protection, "30"
                )
            )
            add(
                DayData(
                    "12:00", R.drawable.ic_wind, "14"
                )
            )
            add(
                DayData(
                    "13:00", R.drawable.ic_wind, "10"
                )
            )
            add(
                DayData(
                    "14:00", R.drawable.ic_water_drop, "20"
                )
            )
            add(
                DayData(
                    "15:00", R.drawable.ic_sun, "25"
                )
            )
        }
    }

    private fun getData(): ArrayList<WeatherData> {
        return ArrayList<WeatherData>().apply {
            add(
                WeatherData(
                    "Rize",
                    "Türkiye",
                    "25 Ağustos",
                    R.raw.rainny, 20,
                    9, 85, 100
                )
            )
            add(
                WeatherData(
                    "İstanbul",
                    "Türkiye",
                    "25 Ağustos",
                    R.raw.sunny, 25,
                    5, 70, 30
                )
            )
            add(
                WeatherData(
                    "İzmir",
                    "Türkiye",
                    "25 Ağustos",
                    R.raw.rainny, 14,
                    4, 90, 100
                )
            )
        }
    }
}