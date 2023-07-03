package com.example.profilesetting

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.AdapterView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivityEdit : AppCompatActivity() {

    private lateinit var etFullName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPhoneNumber: EditText
    private lateinit var spinner1: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var etAbout: EditText
    private lateinit var etInterest: EditText
    private lateinit var etAddress: EditText
    private lateinit var btnSaveChanges: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile1)

        // Find views by their respective IDs
        etFullName = findViewById(R.id.etFullName)
        etEmail = findViewById(R.id.etEmail)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        spinner1 = findViewById(R.id.spinner1)
        spinner2 = findViewById(R.id.spinner2)
        etAbout = findViewById(R.id.etAbout)
        etInterest = findViewById(R.id.etInterest)
        etAddress = findViewById(R.id.etAddress)
        btnSaveChanges = findViewById(R.id.btnSaveChanges)

        // Set text color to watermelon color for EditText fields
        etFullName.setTextColor(Color.parseColor("#FF4D67"))
        etEmail.setTextColor(Color.parseColor("#FF4D67"))
        etPhoneNumber.setTextColor(Color.parseColor("#FF4D67"))
        etAbout.setTextColor(Color.parseColor("#FF4D67"))
        etInterest.setTextColor(Color.parseColor("#FF4D67"))
        etAddress.setTextColor(Color.parseColor("#FF4D67"))

        // Set click listener for the btnSaveChanges button
        btnSaveChanges.setOnClickListener {
            // Perform actions on button click
            saveChanges()
        }

        // Set item selection listener for spinner1 (Gender)
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                parent.getItemAtPosition(position).toString()
                // Handle the selected gender value
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle the case when nothing is selected
            }
        }

        // Set item selection listener for spinner2 (Age)
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                parent.getItemAtPosition(position).toString()
                // Handle the selected age range value
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle the case when nothing is selected
            }
        }

        // Add code for handling other UI components and their events as needed
    }

    private fun saveChanges() {
        // Retrieve the values from the EditText fields and perform the necessary actions
        etFullName.text.toString()
        etEmail.text.toString()
        etPhoneNumber.text.toString()
        etAbout.text.toString()
        etInterest.text.toString()
        etAddress.text.toString()

        // Perform actions with the retrieved values
    }
}
