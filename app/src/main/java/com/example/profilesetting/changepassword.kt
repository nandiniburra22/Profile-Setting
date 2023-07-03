package com.example.profilesetting

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var currentPasswordEditText: EditText
    private lateinit var newPasswordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var changePasswordButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_security)

        currentPasswordEditText = findViewById(R.id.et_current_password)
        newPasswordEditText = findViewById(R.id.et_new_password)
        confirmPasswordEditText = findViewById(R.id.et_confirm_password)
        changePasswordButton = findViewById(R.id.btn_change_password)

        changePasswordButton.setOnClickListener {
            val currentPassword = currentPasswordEditText.text.toString()
            val newPassword = newPasswordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            if (validateInput(currentPassword, newPassword, confirmPassword)) {
                // Call your change password API or update password logic here

                // Show success message to the user
                showToast("Password changed successfully")
                finish()
            }
        }
    }

    private fun validateInput(currentPassword: String, newPassword: String, confirmPassword: String): Boolean {
        // Add your validation logic here
        // For example, check if the new password meets certain criteria and if the confirmation matches

        if (newPassword != confirmPassword) {
            showToast("New password and confirmation password do not match")
            return false
        }

        // Add other validation checks if needed

        return true
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ChangePasswordActivity::class.java)
        }
    }
}

class changepassword {
}