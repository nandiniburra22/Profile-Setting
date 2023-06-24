package com.example.profilesetting

import android.widget.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile1)

        // Access the views by their respective IDs
        val fullNameEditText = findViewById<EditText>(R.id.etFullName)
        val emailEditText = findViewById<EditText>(R.id.etEmail)
        val phoneNumberEditText = findViewById<EditText>(R.id.etPhoneNumber)
        val genderSpinner = findViewById<Spinner>(R.id.GenderSpinner)
        val aboutEditText = findViewById<EditText>(R.id.etAbout)
        val interestEditText = findViewById<EditText>(R.id.etInterest)
        val addressEditText = findViewById<EditText>(R.id.etAddress)
        val SaveChangesEditText = findViewById<EditText>(R.id.etSaveChanges)

        // Create an ArrayAdapter for the gender spinner
        val genderOptions = arrayOf("Male", "Female", "Other")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genderOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        genderSpinner.adapter = adapter
        genderSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedGender = genderOptions[position]
                // Do something with the selected gender
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case when nothing is selected
            }
        }

        // Set a click listener for the "Save Changes" button
        SaveChangesEditText.setOnClickListener {
            // Retrieve the values from the EditText fields
            val fullName = fullNameEditText.text.toString()
            val email = emailEditText.text.toString()
            val phoneNumber = phoneNumberEditText.text.toString()
            val selectedGender = genderSpinner.selectedItem.toString()
            val about = aboutEditText.text.toString()
            val interest = interestEditText.text.toString()
            val address = addressEditText.text.toString()

            // Use the retrieved values as needed
            val message = "Full Name: $fullName\nEmail: $email\nPhone Number: $phoneNumber\nGender: $selectedGender\nAbout: $about\nInterest: $interest\nAddress: $address"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
