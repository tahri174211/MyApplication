package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ActivityRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Trouver le TextView par son ID
        val versLoginTextView = findViewById<TextView>(R.id.verslogin)

        // Ajouter un gestionnaire de clic au TextView
        versLoginTextView.setOnClickListener {
            // Créer un Intent pour lancer ActivityLog
            val intent = Intent(this, ActivityLog::class.java)
            startActivity(intent)
        }
    }
}
