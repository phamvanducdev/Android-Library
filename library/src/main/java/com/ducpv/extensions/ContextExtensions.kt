package com.ducpv.extensions

import android.content.Context
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 * Created by pvduc9773 on 12/11/2023.
 */

fun Context.showToast(any: Any, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, any.toString(), duration).show()
}

fun Context.getColorCompat(@ColorRes resId: Int): Int {
    return ContextCompat.getColor(this, resId)
}