package com.cleanarchitecture.presentation.news

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.cleanarchitecture.presentation.R
import com.cleanarchitecture.presentation.base.BaseActivity
import com.cleanarchitecture.presentation.base.BaseViewModel

class NewsActivity : BaseActivity<BaseViewModel>() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

    }

    override fun addLayout(): Int {
        return R.layout.activity_news
    }
}