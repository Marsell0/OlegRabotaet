package com.example.olegrabotaet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        launchScreen()
    }
    private fun launchScreen() {
//Получаем login переданный по ключу "loginKey"
        findViewById<FrameLayout>(R.id.bt_supercomp).setOnClickListener {
            val intent = Intent(this, ComputerActivity::class.java)
            intent.putExtra("picture",R.drawable.supercomp)
            startActivity(intent)
        }
        findViewById<FrameLayout>(R.id.bt_supercomp2).setOnClickListener {
            val intent = Intent(this, ComputerActivity::class.java)
            startActivity(intent)
        }
//        findViewById<FrameLayout>(R.id.bt_coolermaster).setOnClickListener {
//            val intent = Intent(this, ComputerActivity::class.java)
//            startActivity(intent)
//        }
//        findViewById<FrameLayout>(R.id.bt_ironside).setOnClickListener {
//            val intent = Intent(this, ComputerActivity::class.java)
//            startActivity(intent)
//        }
//        findViewById<FrameLayout>(R.id.bt_mac).setOnClickListener {
//            val intent = Intent(this, ComputerActivity::class.java)
//            startActivity(intent)
//        }
//        findViewById<FrameLayout>(R.id.bt_mfcom).setOnClickListener {
//            val intent = Intent(this, ComputerActivity::class.java)
//            startActivity(intent)
//        }
    }
}