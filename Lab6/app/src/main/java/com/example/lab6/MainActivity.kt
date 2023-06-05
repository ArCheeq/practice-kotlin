package com.example.lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToNextActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)

        // Передача параметрів до наступної Activity
        val person = Person("John", 25)
        startActivity(Intent(
            this,
            SecondActivity::class.java).apply {
            putExtra("person", person)
        })
    }
}