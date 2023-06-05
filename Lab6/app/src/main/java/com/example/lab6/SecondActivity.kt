package com.example.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var personNameTextView: TextView
    private lateinit var personAgeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        personNameTextView = findViewById(R.id.personNameTextView)
        personAgeTextView = findViewById(R.id.personAgeTextView)

        // Отримання параметрів з попередньої Activity
        val person = intent?.getParcelableExtra<Person>("person")

        // Відображення переданих даних
        personNameTextView?.text = person?.name
        personAgeTextView?.text = person?.age.toString()
    }
}