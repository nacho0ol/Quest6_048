package com.example.myarsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.room.util.copy
import com.example.myarsitekturmvvm.model.Siswa

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStarteFlow(value = Siswa())

    val statusUI: StarterFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls:MutableList<Siswa>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(nama=ls[0], gender=ls[1], alamat=ls[2],)
        }
    }
}