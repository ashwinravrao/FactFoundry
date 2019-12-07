package com.ashwinrao.factfoundry.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ashwinrao.factfoundry.R
import com.ashwinrao.factfoundry.databinding.ViewholderCountryBinding

class CountriesListAdapter :
    ListAdapter<String, CountriesListAdapter.CountryViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder =
        CountryViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.viewholder_country,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.binding.countryName.text = getItem(position)
    }

    inner class CountryViewHolder(val binding: ViewholderCountryBinding) :
        RecyclerView.ViewHolder(binding.root)
}

class DiffUtil : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
        oldItem.contentEquals(newItem)
}