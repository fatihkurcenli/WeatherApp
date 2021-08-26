package com.autumnsun.weatherapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autumnsun.weatherapp.databinding.SevendayItemBinding

class DayAdapter(
    var listDay: ArrayList<DayData>
) : RecyclerView.Adapter<DayAdapter.DayAdapterViewHolder>() {
    class DayAdapterViewHolder(val binding: SevendayItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayAdapterViewHolder {
        return DayAdapterViewHolder(
            SevendayItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun getItemCount(): Int {
        return listDay.size
    }

    override fun onBindViewHolder(holder: DayAdapterViewHolder, position: Int) {
        holder.binding.dayCel.text = listDay[position].dayCel
        holder.binding.hours.text = listDay[position].hours
        holder.binding.weatherImage.setImageResource(listDay[position].logoSource)
    }


}