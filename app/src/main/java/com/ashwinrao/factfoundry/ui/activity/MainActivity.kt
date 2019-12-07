package com.ashwinrao.factfoundry.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ashwinrao.factfoundry.R
import com.ashwinrao.factfoundry.databinding.ActivityMainBinding
import com.ashwinrao.factfoundry.ui.fragment.CountryListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        showFragment(CountryListFragment())
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(binding.frameLayout.id, fragment).commit()
    }
}
