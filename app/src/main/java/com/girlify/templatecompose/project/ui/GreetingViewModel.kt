package com.girlify.templatecompose.project.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.girlify.templatecompose.project.domain.DataUseCase
import com.girlify.templatecompose.project.ui.model.DataModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GreetingViewModel @Inject constructor(
    private val dataUseCase: DataUseCase
) : ViewModel() {

    private val _data = MutableLiveData<DataModel>()
    val data: LiveData<DataModel> = _data

    fun onCreate() {
        viewModelScope.launch {
            _data.value = dataUseCase()
        }
    }
}