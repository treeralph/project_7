package com.example.youtubeapi.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.youtubeapi.presentation.fragment.BlankFragment1
import com.example.youtubeapi.presentation.fragment.BlankFragment2
import com.example.youtubeapi.presentation.fragment.BlankFragment3

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> BlankFragment1()
            1 -> BlankFragment2()
            2 -> BlankFragment3()
            else -> { throw Exception() }
        }
    }
}