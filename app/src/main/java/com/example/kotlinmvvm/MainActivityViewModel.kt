package com.example.kotlinmvvm

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(val registerRepo: RegisterRepo) : ViewModel() {

    private val _register : MutableLiveData<ResponseModel> = MutableLiveData()
    val registerUserr : LiveData<ResponseModel> = _register

    @SuppressLint("CheckResult")
    fun getGithubAccount(name : String, email : String, pass : String) {
        registerRepo
            .register(name, email, pass)
            .subscribe {
                _register.postValue(it)
            }
    }

}