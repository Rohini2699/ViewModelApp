package com.example.viewmodelapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class Number:ViewModel()
{
    private val _counter=MutableLiveData<Int>() //here mutable live data is the subclass of the livedata that allows you to modify the value it holds .

    init {
        _counter.value = 0
        // it is used to intialise the property when the instance of the class is created .
    }

    val counter:LiveData<Int>
        get() = _counter
    fun incrementCounter(){

        _counter.value= (_counter.value?:0)+1
    }
}



