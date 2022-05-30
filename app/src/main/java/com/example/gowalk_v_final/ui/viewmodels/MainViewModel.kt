package com.example.gowalk_v_final.ui.viewmodels


import androidx.lifecycle.ViewModel
import com.example.gowalk_v_final.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(
    val mainRepository: MainRepository
): ViewModel(){
}