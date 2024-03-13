package com.hypersoft.admobadsbeta.ui.banners

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.hypersoft.admobadsbeta.R
import com.hypersoft.admobadsbeta.ads.utils.AdsType
import com.hypersoft.admobadsbeta.ui.banners.ActivityBannerOne.Companion.bannerAdsConfig

class ActivityBannerTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner_two)

        loadBanner()

        findViewById<MaterialButton>(R.id.mb_next).setOnClickListener { startActivity(Intent(this, ActivityBannerThree::class.java)) }
    }

    private fun loadBanner() {
        bannerAdsConfig.loadBannerAd(
            activity = this,
            adType = AdsType.BANNER_TWO,
            viewGroup = findViewById(R.id.fl_container)
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        bannerAdsConfig.destroyBanner(adType = AdsType.BANNER_TWO)
    }
}