package com.example.lab5

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MotionEvent
import android.widget.Toast
import com.example.lab5.databinding.ActivityMainBinding
import java.*

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val textView = bindingClass.textView
        val changeTextClickListener = ChangeTextButtonClickListener(textView)
        val textViewTouchListener = TextViewTouchListener(textView)

        val toastButton = bindingClass.toastButton
        val toastClickListener = ToastButtonClickListener(this)
        toastButton.setOnClickListener(toastClickListener)

        val changeTextButton = bindingClass.changeTextButton
        changeTextButton.setOnClickListener(changeTextClickListener)

        val changeColorButton = bindingClass.changeColorButton
        val changeColorClickListener = ChangeColorButtonClickListener(changeColorButton)
        changeColorButton.setOnClickListener(changeColorClickListener)

        textView.setOnTouchListener(textViewTouchListener)

        val personNameInput = bindingClass.editTextTextPersonName
        val personNameInputWatcher = PersonNameInputTextWatcher(personNameInput)
        personNameInput.addTextChangedListener(personNameInputWatcher)
    }
}