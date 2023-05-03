package com.girlify.templatecompose.project.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.girlify.templatecompose.project.ui.model.DataModel

@Composable
fun Greeting(viewModel: GreetingViewModel) {
    val data: DataModel by viewModel.data.observeAsState(DataModel(""))

    LaunchedEffect(Unit) {
        viewModel.onCreate()
    }

    Text(
        text = "Hello ${data.name}!"
    )
}
