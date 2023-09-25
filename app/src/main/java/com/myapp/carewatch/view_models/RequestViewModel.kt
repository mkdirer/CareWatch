package com.myapp.carewatch.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RequestViewModel : ViewModel(){

    private val requestId = MutableLiveData<String>()

    fun setRequest(mRequestId:String){
        requestId.value = mRequestId
    }

    fun getRequest(): LiveData<String> = requestId

}