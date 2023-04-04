package com.example.lab5

import android.content.Context
import android.view.View
import android.widget.Toast

class ToastButtonClickListener(private val context: Context) : View.OnClickListener {
    override fun onClick(view: View?) {
        Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show()
    }
}