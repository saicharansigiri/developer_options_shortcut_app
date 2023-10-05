package com.sigiri.developeroptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        launchDeveloperOptions()
    }

    private fun launchDeveloperOptions(){
        try {
            val i = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)
            this.startActivity(i)
            finish()
        }catch (e:Exception){
           Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}