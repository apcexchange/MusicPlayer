package com.example.mymusic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymusic.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment(R.layout.fragment_splash_screen) {

    private var _binding : FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpSplashScreen()

        return binding.root
    }

    private fun setUpSplashScreen() {
        TODO("Not yet implemented")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}