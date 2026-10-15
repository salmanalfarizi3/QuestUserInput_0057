package com.example.questuserinput_0057

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable

fun FormDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateOf(value = "") }
