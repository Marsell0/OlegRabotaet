package com.example.olegrabotaet

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat

class Computer2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer2)
        onButtonClick()
    }

    private fun onButtonClick() {
        val button: Button = findViewById(R.id.rentButton)
        button.setOnClickListener{
            createNotification("Вы успешно забронировали компьютер и он ожидает Вас!", R.drawable.ic_pc_azza)
        }
    }
    private fun createNotification(text: String, image: Int){
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(
                CHANEL_ID, CHANEL_ID, NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(notificationChannel)
        }
        val notification = NotificationCompat.Builder(this, CHANEL_ID)
            .setContentTitle("Напоминание")
            .setContentText(text)
            .setSmallIcon(image)
            .build()
        notificationManager.notify(1, notification)
    }
    companion object{
        private const val CHANEL_ID = "Напоминания"
        private const val CHANEL_NAME = "chanel_name"
    }
}