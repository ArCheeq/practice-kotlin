package com.example.lab5

import android.graphics.Color
import android.view.MotionEvent
import android.view.View
import android.widget.TextView

class TextViewTouchListener(private val textView: TextView) : View.OnTouchListener {
    override fun onTouch(view: View?, event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                textView.setTextColor(Color.BLUE)
                return true
            }
            MotionEvent.ACTION_UP -> {
                textView.setTextColor(Color.BLACK)
                return true
            }
            else -> return false
        }
    }
}