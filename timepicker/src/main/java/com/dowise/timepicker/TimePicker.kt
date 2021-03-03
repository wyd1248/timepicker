package com.dowise.timepicker

import android.content.Context
import android.widget.Toast

object TimePicker {

    fun show(context: Context, string: String) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }
}
