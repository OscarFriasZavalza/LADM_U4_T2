package com.example.ladm_u4_t2

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val REQUEST_CODE_ENABLE_BT:Int = 1
    private val REQUEST_CODE_DISCOVERABLE_BT:Int = 2


lateinit var blueAdaptaer:BluetoothAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blueAdaptaer=BluetoothAdapter.getDefaultAdapter()
    }

    fun activar(){

            blueAdaptaer.enable()


    }
    fun desactivar(){




    }
    fun estado(){

    }

}