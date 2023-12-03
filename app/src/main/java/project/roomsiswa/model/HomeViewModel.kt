package project.roomsiswa.model

import androidx.lifecycle.ViewModel
import project.roomsiswa.repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa):ViewModel(){
    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }
}