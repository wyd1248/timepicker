package com.github.timepicker

import android.app.TimePickerDialog
import android.content.Context
import android.widget.Toast

object TimePicker {

    fun show(context: Context, string: String) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }

    fun showTimePicker(context: Context) {
        TimePickerDialog(
            context, { _, hourOfDay, minute ->
                show(
                    context,
                    "$hourOfDay:$minute"
                )
            }, 1, 2, true
        ).show()
    }
}
