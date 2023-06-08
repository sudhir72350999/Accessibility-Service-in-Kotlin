package com.test.accessibilityserviceinkotlin

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var allowPermissions: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        allowPermissions = findViewById(R.id.allowPermission)
        allowPermissions.setOnClickListener(View.OnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
            Toast.makeText(this@MainActivity,"whatsapp launched", Toast.LENGTH_SHORT)
        })

    }
}