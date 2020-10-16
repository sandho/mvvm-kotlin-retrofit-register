package com.example.kotlinmvvm

import android.util.Log
import android.widget.Toast
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RegisterRepo(private val api: Api) {

    fun register(name : String, email : String, pass : String) : Observable<ResponseModel> {
        return Observable.create { emitter ->

            api.registerUser(name, email, pass)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    if (it.body() != null) {
                        emitter.onNext(it.body()!!)
                        Log.d("TAG", "register: "+it.body())
                    }
                }, {
                    it.printStackTrace()
                    Log.d("TAG", "register: er "+it.printStackTrace())
                })

        }
    }

}