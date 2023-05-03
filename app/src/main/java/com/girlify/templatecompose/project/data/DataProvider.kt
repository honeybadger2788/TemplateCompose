package com.girlify.templatecompose.project.data

import com.girlify.templatecompose.project.data.model.DataModelResponse

class DataProvider {
    companion object {
        var data:List<DataModelResponse> = listOf(
            DataModelResponse("Clark Kent"),
            DataModelResponse("Bruce Wayne"),
            DataModelResponse("Tonny Stark"),
            DataModelResponse("Peter Parker")
        )
    }
}