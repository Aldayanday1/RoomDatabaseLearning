package project.roomsiswa

import android.app.Application
import project.roomsiswa.repositori.ContainerApp

class AplikasiSiswa : Application() {
    /*
    * AppContainer instance digunakan oleh kelas-kelas lainnya untuk medapatkan dependensi
    */
    lateinit var container: ContainerApp
}