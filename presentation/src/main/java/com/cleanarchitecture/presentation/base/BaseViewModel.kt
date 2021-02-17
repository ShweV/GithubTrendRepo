package com.cleanarchitecture.presentation.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Srihari Pasupula on 17-02-2021.
 */
open class BaseViewModel : ViewModel() {

    val uiState: LiveData<Boolean> = MutableLiveData<Boolean>()


    fun showProgressBar(isVisible: Boolean) {
        (uiState as MutableLiveData).value = isVisible
    }


}