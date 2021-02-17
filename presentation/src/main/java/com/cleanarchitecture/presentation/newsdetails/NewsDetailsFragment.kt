package com.cleanarchitecture.presentation.newsdetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cleanarchitecture.presentation.R
import com.cleanarchitecture.presentation.base.BaseFragment

class NewsDetailsFragment : BaseFragment<NewsDetailsViewModel>() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setLayout(): Int {
        return R.layout.news_details_fragment
    }

}