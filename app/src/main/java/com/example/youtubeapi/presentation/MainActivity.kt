package com.example.youtubeapi.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youtubeapi.Fragment1_TAG
import com.example.youtubeapi.Fragment2_TAG
import com.example.youtubeapi.Fragment3_TAG
import com.example.youtubeapi.R
import com.example.youtubeapi.adapter.ViewPagerAdapter
import com.example.youtubeapi.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {

        with(binding) {
            viewPager.adapter = ViewPagerAdapter(this@MainActivity)
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when(position) {
                    0 -> tab.text = Fragment1_TAG
                    1 -> tab.text = Fragment2_TAG
                    2 -> tab.text = Fragment3_TAG
                }
            }.attach()
        }
    }
}