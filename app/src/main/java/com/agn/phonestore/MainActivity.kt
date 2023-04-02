package com.agn.phonestore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agn.phonestore.auth.Register
import java.util.*

class MainActivity : AppCompatActivity() {
    var timer: Timer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timer = Timer()
        timer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@MainActivity, Register::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000)
    }
}



