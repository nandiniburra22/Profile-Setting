package com.example.profilesetting

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileSettingsActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)

        etUsername = findViewById(R.id.etUsername)
        btnSave = findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            saveProfileSettings()
        }
    }

    private fun saveProfileSettings() {
        val username = etUsername.text.toString()
        // Save the username to your app's backend or preferences

        Toast.makeText(this, "Profile settings saved", Toast.LENGTH_SHORT).show()
    }
}
