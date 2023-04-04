package com.example.lab5

import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

class PersonNameInputTextWatcher(private val personNameInput: EditText) : TextWatcher {
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        // Вызывается перед изменением текста
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        // Вызывается при изменении текста
        personNameInput.setTextColor(Color.GREEN)
    }

    override fun afterTextChanged(s: Editable?) {
        // Вызывается после изменения текста
        personNameInput.setTextColor(Color.BLACK)
    }
}