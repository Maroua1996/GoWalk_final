package com.example.gowalk_v_final.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.gowalk_v_final.R
import com.example.gowalk_v_final.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


class TrackingFragment  : Fragment(R.layout.fragment_tracking) {

    private val viewModel : MainViewModel by viewModels()


}