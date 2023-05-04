package com.girlify.templatecompose.project.domain

import com.girlify.templatecompose.project.data.DataRepository
import com.girlify.templatecompose.project.ui.model.DataModel
import javax.inject.Inject

class DataUseCase @Inject constructor(
    private val dataRepository: DataRepository
) {
    operator fun invoke(): DataModel = dataRepository.getData().random()
}