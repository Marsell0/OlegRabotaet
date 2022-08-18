package com.example.olegrabotaet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
    }

    private fun signIn() {
    findViewById<Button>(R.id.regBtn).setOnClickListener {
        //Получаем логин из поля ввода логина
        val login = findViewById<EditText>(R.id.loginTextBox).text.toString()
        //Получаем пароль из поля ввода пароля
        val password = findViewById<EditText>(R.id.passwordTextBox).text.toString()
        //Проверяем логин и пароль на пустоту
        if (login.isNotEmpty() && password.isNotEmpty()) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Оба поля должны быть заполнены", Toast.LENGTH_SHORT).show()
        }
        }
    }
}