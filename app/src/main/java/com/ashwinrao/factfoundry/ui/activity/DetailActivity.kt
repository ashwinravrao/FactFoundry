package com.ashwinrao.factfoundry.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ahmadrosid.svgloader.SvgLoader
import com.ashwinrao.factfoundry.R
import com.ashwinrao.factfoundry.databinding.ActivityDetailBinding
import com.ashwinrao.factfoundry.extra_detail_activity
import com.ashwinrao.factfoundry.viewmodel.DetailViewModel
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val viewModel: DetailViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        fetchData(intent.extras?.get(extra_detail_activity).toString())
    }

    private fun fetchData(country: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = viewModel.fetchCountryResponse(country)
            withContext(Dispatchers.Main) {
                if (response != null) {
                    val countryResponse = response[0]
                    binding.country = countryResponse
                    loadFlag(countryResponse.flag)
                }
            }
        }
    }

    private fun loadFlag(url: String) {
        SvgLoader.pluck()
            .with(this)
            .load(url, flag_image_view)
    }

}