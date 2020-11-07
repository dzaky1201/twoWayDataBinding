package com.dzakyhdr.twowaydatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val cek = MutableLiveData<String>()

    init {
        cek.value = "Dzaky"
    }
}