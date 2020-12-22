package com.example.firstapp.ui.Contacts.helper

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

const val NAME = "name"
const val SURNAME = "surname"
const val IMAGE = "image"
const val PHONE_NUMBER = "phoneNumber"

class SharedPreferences(context: Context) {

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("application", Context.MODE_PRIVATE)

    var name: String
        get() {
            return sharedPreferences.getStringOrDefault(NAME, "Aziza")
        }
        set(value) {
            sharedPreferences.edit {
                putString(NAME, value)
            }
        }

    var surname: String
        get() {
            return sharedPreferences.getStringOrDefault(SURNAME, "Sadykova")
        }
        set(value) {
            sharedPreferences.edit {
                putString(SURNAME, value)
            }
        }

    var image: String
        get() {
            return sharedPreferences.getStringOrDefault(IMAGE, "data:image/jpeg;base64,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")
        }
        set(value) {
            sharedPreferences.edit {
                putString(IMAGE, value)
            }
        }

    var phoneNumber: String
        get() {
            return sharedPreferences.getStringOrDefault(PHONE_NUMBER, "+99654657574")
        }
        set(value) {
            return sharedPreferences.edit {
                putString(PHONE_NUMBER, value)
            }
        }

    private fun SharedPreferences.getStringOrDefault(key: String, default: String = "") =
        getString(key, default) ?: default
}


