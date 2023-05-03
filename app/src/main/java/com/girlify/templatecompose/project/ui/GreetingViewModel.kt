package com.girlify.templatecompose.project.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.girlify.templatecompose.project.domain.DataUseCase
import com.girlify.templatecompose.project.ui.model.DataModel
import kotlinx.coroutines.launch

class GreetingViewModel: ViewModel() {
    private val dataUseCase: DataUseCase = DataUseCase()

    private val _data = MutableLiveData<DataModel>()
    val data: LiveData<DataModel> = _data

    fun onCreate() {
        viewModelScope.launch {
            _data.value = dataUseCase()
        }
    }
}