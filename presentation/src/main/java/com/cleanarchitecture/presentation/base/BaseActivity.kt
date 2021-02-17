package com.cleanarchitecture.presentation.base

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

/**
 * Created by Srihari Pasupula on 17-02-2021.
 */
abstract class BaseActivity<T : BaseViewModel>: AppCompatActivity() {

    protected lateinit var viewModel: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(addLayout())
        viewModel =  ViewModelProviders.of(this).get(viewModel!!::class.java)
        viewModel?.uiState?.observe(this, Observer {
            if (it)
                Toast.makeText(this, "success", Toast.LENGTH_LONG).show()

        })
    }



    abstract fun addLayout():Int

}