package com.example.lab5

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.widget.Button

class ChangeColorButtonClickListener(private val button: Button) : View.OnClickListener {
    private val initialButtonColor = button.backgroundTintList?.defaultColor
    private var currentButtonColor = initialButtonColor

    override fun onClick(view: View?) {
        if (currentButtonColor == initialButtonColor) {
            button.backgroundTintList = ColorStateList.valueOf(Color.RED)
            currentButtonColor = Color.RED
        } else {
            button.backgroundTintList = ColorStateList.valueOf(initialButtonColor!!)
            currentButtonColor = initialButtonColor
        }
    }
}