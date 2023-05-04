package com.girlify.templatecompose.project.data

import com.girlify.templatecompose.project.ui.model.DataModel
import javax.inject.Inject

class DataRepository @Inject constructor() {
    private val dataProvider = DataProvider

    fun getData(): List<DataModel> =
        dataProvider.data.map { it.toDomain() }
}