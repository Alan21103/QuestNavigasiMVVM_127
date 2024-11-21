package com.example.questnavigasimvvm_127.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.questnavigasimvvm_127.model.DataSiswa

@Composable
fun TampilDataView(
    uiState: DataSiswa,
    onBackButton : () -> Unit){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(30.dp))
    {
        TampilData(param= "Nama", argu = uiState.nama )
        TampilData(param = "Jenis Kelamin", argu = uiState.gender)
        TampilData(param = "NIM", argu = uiState.nim)
        TampilData(param = "Email", argu = uiState.email)
        TampilData(param = "Alamat", argu = uiState.alamat)
        TampilData(param = "No Telepon", argu = uiState.notelepon)
        Button(onClick = onBackButton) {
            Text(text = "Kembali")
        }
    }

}

@Composable
fun TampilData(
    param: String, argu:String
) {}