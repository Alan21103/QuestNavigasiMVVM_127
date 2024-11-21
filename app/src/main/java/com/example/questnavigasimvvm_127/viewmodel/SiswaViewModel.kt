package com.example.questnavigasimvvm_127.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm_127.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    //request
    private val _statusUI = MutableStateFlow(DataSiswa())

    //response
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                alamat = ls[1],
                gender = ls[2],
                notelepon = ls[3],
                email = ls[4],
                nim = ls[5]
            )
        }
    }
}