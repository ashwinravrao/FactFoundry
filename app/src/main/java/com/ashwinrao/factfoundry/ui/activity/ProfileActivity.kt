package com.ashwinrao.factfoundry.ui.activity

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ashwinrao.factfoundry.R
import com.ashwinrao.factfoundry.databinding.ActivityProfileBinding
import com.ashwinrao.factfoundry.github_profile_url
import com.ashwinrao.factfoundry.linkedin_profile_url
import com.google.android.material.card.MaterialCardView

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        binding.closeButton.setOnClickListener { this.finishAfterTransition() }
        listenToProfileCircle(binding.accountCircleContainer)
        binding.viewMoreProjectsButton.setOnClickListener { createBrowserIntent(github_profile_url) }
        binding.viewLinkedinProfileButton.setOnClickListener {
            createBrowserIntent(
                linkedin_profile_url
            )
        }
    }

    private fun listenToProfileCircle(card: MaterialCardView) {
        card.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_profile_image)
            dialog.show()
        }
    }

    private fun createBrowserIntent(url: String) {
        val webPage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webPage)
        if (intent.resolveActivity(packageManager) != null) startActivity(intent)
    }

}