package com.ashwinrao.factfoundry.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ashwinrao.factfoundry.R
import com.ashwinrao.factfoundry.databinding.ViewholderCountryBinding

class CountriesListAdapter(
    private val countriesList: List<String>,
    private val adapterOnClick: (Int) -> Unit
) :
    RecyclerView.Adapter<CountriesListAdapter.CountryViewHolder>() {

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
        holder.binding.countryName.text = countriesList[position]
    }

    override fun getItemCount(): Int = countriesList.size

    inner class CountryViewHolder(val binding: ViewholderCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.outerCard.setOnClickListener { adapterOnClick(adapterPosition) }
        }

    }


}