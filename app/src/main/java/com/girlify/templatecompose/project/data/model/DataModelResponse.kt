package com.girlify.templatecompose.project.data.model

import com.girlify.templatecompose.project.ui.model.DataModel

class DataModelResponse(
    val name: String
) {
    fun toDomain(): DataModel {
        return DataModel(this.name)
    }
}