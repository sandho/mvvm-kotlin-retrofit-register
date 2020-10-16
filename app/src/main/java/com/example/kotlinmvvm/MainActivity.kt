package com.example.kotlinmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProviders.of(this, ViewModelFactory(RepositoryFactory.createRegisterRespo())).get(MainActivityViewModel::class.java)

        mainActivityViewModel.registerUserr.observe(this, {
            textView.text = it.toString()
        })

        mainActivityViewModel.getGithubAccount("rigegi1168", "rigegi1168@uniteditcare.com", "rigegi1168")

    }
}