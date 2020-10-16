package com.example.kotlinmvvm

import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("message") var message : String = ""
)