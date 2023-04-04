package com.example.lab5

import android.view.View
import android.widget.TextView

class ChangeTextButtonClickListener(private val textView: TextView) : View.OnClickListener {
    override fun onClick(view: View?) {
        textView.text = "Text changed!"
    }
}