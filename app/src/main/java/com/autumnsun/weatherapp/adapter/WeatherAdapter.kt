package com.autumnsun.weatherapp.adapter

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autumnsun.weatherapp.R
import com.autumnsun.weatherapp.databinding.HomeItemBinding

class WeatherAdapter(
    var weatherData: ArrayList<WeatherData>
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

    override fun onBindViewHolder(holder: WeatherAdapterViewHolder, position: Int) {
        holder.binding.cityTextView.text = weatherData[position].city
        holder.binding.countryTextView.text = weatherData[position].country
        holder.binding.whichDayTextView.text = weatherData[position].day
        holder.binding.lottieAnimations.setAnimation(weatherData[position].logoResource)
    }

    override fun getItemCount(): Int {
        return weatherData.size
    }

}