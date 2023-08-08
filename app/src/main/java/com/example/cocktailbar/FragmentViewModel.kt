package com.example.cocktailbar

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {
    var data = MutableLiveData<String>()

    fun update(new : String){
        data.value = new
    }
}