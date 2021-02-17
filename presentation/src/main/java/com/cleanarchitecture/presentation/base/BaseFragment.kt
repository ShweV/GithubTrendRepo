package com.cleanarchitecture.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

/**
 * Created by Srihari Pasupula on 17-02-2021.
 */
abstract class BaseFragment<T : BaseViewModel> : Fragment() {

    protected lateinit var viewModel: T


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(viewModel!!::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutInflater = inflater.inflate(setLayout(), container, false)
        return layoutInflater
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel?.uiState?.observe(requireActivity(), Observer {
            if (it)
                Toast.makeText(context, "success", Toast.LENGTH_LONG).show()


        })

    }

    abstract fun setLayout(): Int
}