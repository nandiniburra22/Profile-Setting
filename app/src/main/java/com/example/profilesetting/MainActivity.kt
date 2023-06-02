package com.example.profilesetting

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Profilesetting : AppCompatActivity() {

    private lateinit var etFullName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPhoneNumber: EditText
    private lateinit var spinnerGender: Spinner
    private lateinit var etAge: EditText
    private lateinit var etAbout: EditText
    private lateinit var etInterest: EditText
    private lateinit var etAddress: EditText
    private lateinit var btnSaveChanges: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilesetting)

        etFullName = findViewById(R.id.etFullName)
        etEmail = findViewById(R.id.etEmail)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        spinnerGender = findViewById(R.id.spinnerGender)
        etAge = findViewById(R.id.etAge)
        etAbout = findViewById(R.id.etAbout)
        etInterest = findViewById(R.id.etInterest)
        etAddress = findViewById(R.id.etAddress)
        btnSaveChanges = findViewById(R.id.btnSaveChanges)

        btnSaveChanges.setOnClickListener {
            saveChanges()
        }
    }

    private fun saveChanges() {
        val fullName = etFullName.text.toString()
        val email = etEmail.text.toString()
        val phoneNumber = etPhoneNumber.text.toString()
        val gender = spinnerGender.selectedItem.toString()
        val age = etAge.text.toString()
        val about = etAbout.text.toString()
        val interest = etInterest.text.toString()
        val address = etAddress.text.toString()

        // Save the profile data to your app's backend or preferences

        Toast.makeText(this, "Changes saved", Toast.LENGTH_SHORT).show()
    }
}

