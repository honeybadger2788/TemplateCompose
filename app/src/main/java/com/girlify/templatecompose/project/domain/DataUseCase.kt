package com.girlify.templatecompose.project.domain

import com.girlify.templatecompose.project.data.DataRepository
import com.girlify.templatecompose.project.ui.model.DataModel

class DataUseCase {
    private val dataRepository: DataRepository = DataRepository()

    operator fun invoke(): DataModel = dataRepository.getData().random()
}