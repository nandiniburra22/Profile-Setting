package com.example.profilesetting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

@Suppress("DEPRECATION")
class MainActivityCreateProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createprofile)

        // Find views
        val profileButton = findViewById<TextView>(R.id.Profile)
        val editButton = findViewById<ImageButton>(R.id.edit)
        val vertButton = findViewById<ImageButton>(R.id.vert)
        val editProfileButton = findViewById<ImageButton>(R.id.imageButton1)
        val notificationButton = findViewById<ImageButton>(R.id.imageButton2)
        val securityButton = findViewById<ImageButton>(R.id.imageButton3)
        val darkModeButton = findViewById<ImageButton>(R.id.imageButton4)
        val friendsButton = findViewById<ImageButton>(R.id.imagebutton5)
        val logoutButton = findViewById<ImageButton>(R.id.imageButton6)

        // Set click listeners
        profileButton.setOnClickListener {
            showToast("Profile button clicked")
        }

        editButton.setOnClickListener {
            showToast("Edit button clicked")
        }

        vertButton.setOnClickListener {
            showToast("Vert button clicked")
        }

        editProfileButton.setOnClickListener {
            showToast("Edit Profile button clicked")
        }

        notificationButton.setOnClickListener {
            showToast("Notification button clicked")
        }

        securityButton.setOnClickListener {
            showToast("Security button clicked")
        }

        darkModeButton.setOnClickListener {
            val isDarkModeEnabled = darkModeButton.isSelected
            darkModeButton.isSelected = !isDarkModeEnabled

            if (isDarkModeEnabled) {
                // Dark mode is enabled
                darkModeButton.setColorFilter(resources.getColor(R.color.Watermelon))
                showToast("Dark Mode turned off")
                // TODO: Apply light mode theme or update UI for light mode
            } else {
                // Dark mode is disabled
                darkModeButton.setColorFilter(resources.getColor(android.R.color.black))
                showToast("Dark Mode turned on")
                // TODO: Apply dark mode theme or update UI for dark mode
            }
        }

        friendsButton.setOnClickListener {
            showToast("Invite Friends button clicked")
        }

        logoutButton.setOnClickListener {
            showToast("Logout button clicked")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
