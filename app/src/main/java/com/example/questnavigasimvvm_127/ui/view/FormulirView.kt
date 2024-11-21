package com.example.questnavigasimvvm_127.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    listJK: List<String>,
    onSubmitClicked: (MutableList<String>) -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var notelepon by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nama, alamat, gender, notelepon, email, nim)

    Column ( modifier = modifier
        .fillMaxSize()
        .padding(top = 30.dp)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = nama,
            onValueChange = { nama = it },
            label = {
                Text(text = "Nama")
            },
            placeholder = {
                Text(text = "Isi Nama Anda")
            },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = nim,
            onValueChange = {nim = it},
            label = {
                Text(text = "NIM")
            },
            placeholder = {
                Text(text = "Isi NIM Anda")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Row (modifier = Modifier.fillMaxWidth().padding(5.dp)) {
            listJK.forEach{selectedGender ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = gender == selectedGender,
                        onClick = {gender = selectedGender})

                    Text (text = selectedGender,
                        modifier = Modifier.padding(start = 3.dp))
                }
                Spacer(modifier = Modifier.width(16.dp))
            }
        }
    }
}