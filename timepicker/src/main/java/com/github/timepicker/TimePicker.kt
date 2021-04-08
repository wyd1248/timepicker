package com.github.timepicker

import android.content.Context
import android.widget.TimePicker
import android.widget.Toast

object TimePicker {

    fun show(context: Context, string: String) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }

    fun showTimePicker(context: Context) {
        TimePicker(context).setOnTimeChangedListener { _, hourOfDay, minute ->
            show(context, "$hourOfDay and $minute")
        }
    }
}
