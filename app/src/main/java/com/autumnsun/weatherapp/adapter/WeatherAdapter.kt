package com.autumnsun.weatherapp.adapter

import android.annotation.SuppressLint
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autumnsun.weatherapp.R
import com.autumnsun.weatherapp.databinding.HomeItemBinding

class WeatherAdapter(
    var weatherData: ArrayList<WeatherData>,
    var secondList: ArrayList<DayData>
) : RecyclerView.Adapter<WeatherAdapter.WeatherAdapterViewHolder>() {
    class WeatherAdapterViewHolder(val binding: HomeItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherAdapterViewHolder {
        return WeatherAdapterViewHolder(
            HomeItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: WeatherAdapterViewHolder, position: Int) {
        holder.binding.cityTextView.text = weatherData[position].city
        holder.binding.countryTextView.text = weatherData[position].country
        holder.binding.appCompatTextView3.text = weatherData[position].day
        holder.binding.lottieAnimations.setAnimation(weatherData[position].logoResource)
        holder.binding.numberC.text = "${weatherData[position].celciusDay} \u00B0"
        holder.binding.windyText.text = "${weatherData[position].windy} km/h"
        holder.binding.waterText.text = "${weatherData[position].damp}%"
        holder.binding.rainyPosibleText.text = "${weatherData[position].rainy}%"
        holder.binding.sevenDayRecyclerView.adapter = DayAdapter(secondList)
    }

    override fun getItemCount(): Int {
        return weatherData.size
    }

}