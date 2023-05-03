package com.girlify.templatecompose.project.data

import com.girlify.templatecompose.project.ui.model.DataModel

class DataRepository {
    private val dataProvider = DataProvider

    fun getData(): List<DataModel> =
        dataProvider.data.map { it.toDomain() }
}