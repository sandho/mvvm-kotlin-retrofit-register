package com.example.kotlinmvvm

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*

interface Api {

    @FormUrlEncoded
    @POST("")
    fun registerUser(@Field("uname") uname: String,
                     @Field("uemail") uemail: String,
                     @Field("upass") upass: String,
    ): Single<Response<ResponseModel>>

}