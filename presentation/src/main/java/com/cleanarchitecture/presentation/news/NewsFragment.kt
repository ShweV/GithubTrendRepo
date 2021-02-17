package com.cleanarchitecture.presentation.news

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cleanarchitecture.presentation.R
import com.cleanarchitecture.presentation.base.BaseFragment
import kotlinx.android.synthetic.main.news_fragment.*

class NewsFragment : BaseFragment<NewsViewModel>() {

    override fun setLayout(): Int {
       return R.layout.news_fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        news_recycler.adapter = NewsAdapter()
    }
}