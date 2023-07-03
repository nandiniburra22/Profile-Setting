package com.example.profilesetting

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivityNotification : AppCompatActivity() {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchSound: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchVibrate: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchNewTips: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchNewService: Switch

    @SuppressLint("ResourceType", "NewApi", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_settings)

        switchSound = findViewById(R.id.switchSound)
        switchVibrate = findViewById(R.id.switchVibrate)
        switchNewTips = findViewById(R.id.switchNewTips)
        switchNewService = findViewById(R.id.switchNewService)

        val watermelonColor = Color.parseColor("#FF3366")
        switchSound.thumbTintList = getColorStateList(watermelonColor)
        switchSound.trackTintList = getColorStateList(watermelonColor)

        switchVibrate.thumbTintList = getColorStateList(watermelonColor)
        switchVibrate.trackTintList = getColorStateList(watermelonColor)

        switchNewTips.thumbTintList = getColorStateList(watermelonColor)
        switchNewTips.trackTintList = getColorStateList(watermelonColor)

        switchNewService.thumbTintList = getColorStateList(watermelonColor)
        switchNewService.trackTintList = getColorStateList(watermelonColor)

        switchSound.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                enableSound()
            } else {
                disableSound()
            }
        }

        switchVibrate.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                enableVibration()
            } else {
                disableVibration()
            }
        }

        switchNewTips.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                enableNewTipsNotification()
            } else {
                disableNewTipsNotification()
            }
        }

        switchNewService.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                enableNewServiceNotification()
            } else {
                disableNewServiceNotification()
            }
        }
    }

    private fun enableSound() {
        // TODO: Implement logic to enable sound
        // Example:
        // AudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL)
    }

    private fun disableSound() {
        // TODO: Implement logic to disable sound
        // Example:
        // AudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT)
    }

    private fun enableVibration() {
        // TODO: Implement logic to enable vibration
        // Example:
        // AudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE)
    }

    private fun disableVibration() {
        // TODO: Implement logic to disable vibration
        // Example:
        // AudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL)
    }

    private fun enableNewTipsNotification() {
        // TODO: Implement logic to enable new tips notification
        // Example:
        // NotificationManagerCompat.from(this).enableChannel("new_tips")
    }

    private fun disableNewTipsNotification() {
        // TODO: Implement logic to disable new tips notification
        // Example:
        // NotificationManagerCompat.from(this).disableChannel("new_tips")
    }

    private fun enableNewServiceNotification() {
        // TODO: Implement logic to enable new service notification
        // Example:
        // NotificationManagerCompat.from(this).enableChannel("new_service")
    }

    private fun disableNewServiceNotification() {
        // TODO: Implement logic to disable new service notification
        // Example:
        // NotificationManagerCompat.from(this).disableChannel("new_service")
    }
}
