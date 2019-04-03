package com.example.viewmodel_livedata_examble.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class InforViewModel:ViewModel(){
    var userName:MutableLiveData<String> = MutableLiveData()
    var address:MutableLiveData<String> = MutableLiveData()
    var age: MutableLiveData<Int> = MutableLiveData()
}