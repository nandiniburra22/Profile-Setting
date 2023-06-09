package com.example.profilesetting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.menu.MaterialMenuItem
import com.google.android.material.menu.MaterialPopupMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Add your code here
        // You can access the views by their respective IDs and perform any necessary operations
        val btnSaveChanges = findViewById<Button>(R.id.btnSaveChanges)
        btnSaveChanges.setOnClickListener {
            // Perform action on button click
            // For example, you can retrieve the text from EditText fields
            val fullName = findViewById<EditText>(R.id.etFullName).text.toString()
            val email = findViewById<EditText>(R.id.etEmail).text.toString()
            val phoneNumber = findViewById<EditText>(R.id.etPhoneNumber).text.toString()
// Inside your activity or fragment code
            val genderMenu = findViewById<MaterialPopupMenu>(R.id.genderMenu)
            val maleMenuItem = findViewById<MaterialMenuItem>(R.id.maleMenuItem)
            val femaleMenuItem = findViewById<MaterialMenuItem>(R.id.femaleMenuItem)

// Set click listeners for menu items
            maleMenuItem.setOnMenuItemClickListener { menuItem ->
                // Handle male menu item click
                true // Return true if you have consumed the event
            }

            femaleMenuItem.setOnMenuItemClickListener { menuItem ->
                // Handle female menu item click
                true // Return true if you have consumed the event
            }

// Show the popup menu when needed
            genderMenu.show()

            val about = findViewById<EditText>(R.id.etAbout).text.toString()
            val interest = findViewById<EditText>(R.id.etInterest).text.toString()
            val address = findViewById<EditText>(R.id.etAddress).text.toString()

            // You can then use the retrieved values as needed
            // For instance, you can save them to a database or display them in a Toast message
            // Example Toast message:
            val message = "Full Name: $fullName\nEmail: $email\nPhone Number: $phoneNumber\nAbout: $about\nInterest: $interest\nAddress: $address"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
