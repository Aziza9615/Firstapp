package com.example.firstapp

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun showSnackbar(
    view: View,
    message: String,
    actionTitle: String,
    action: () -> Unit
) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).setAction(actionTitle) {
            action()
        }.show()
    }

    fun checkFieldIsEmpty(value: String, context: Context, message: String): Boolean {
        if (value.isEmpty()) {
            showToast(context, message)
            return true
        }
        return false
    }

    fun checkFieldIsSame(
        first: String,
        second: String,
        context: Context,
        message: String
    ): Boolean {
        if (first != second) {
            showToast(context, message)
            return true
        }

        if (first.length <= 6) {
            showToast(context, "Поле не должно быть меньше 6 символов")
            return true
        }
        return false
    }

    fun intentToNext(context: Context, clazz: Class<*>) {
        val intent = Intent(context, clazz)
        context.startActivity(intent)
    }
