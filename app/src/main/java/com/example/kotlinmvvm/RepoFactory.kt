package com.example.kotlinmvvm

object RepositoryFactory {

    fun createRegisterRespo() : RegisterRepo {
        val apirepo = ApiClient.instance.retrofit.create(Api::class.java)
        return RegisterRepo(apirepo)
    }

}