package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Trouver le bouton par son ID
        val btnLog = findViewById<View>(R.id.btn_log)
        // Trouver le bouton par son ID
        val btnSignup = findViewById<AppCompatButton>(R.id.btn_signup)

        // Ajouter un gestionnaire de clic au bouton
        btnLog.setOnClickListener {
            // Créer un Intent pour lancer ActivityLog
            val intent = Intent(this, ActivityLog::class.java)
            startActivity(intent)
        }
        // Ajouter un gestionnaire de clic au bouton
        btnSignup.setOnClickListener {
            // Créer un Intent pour lancer ActivityRegister
            val intent = Intent(this, ActivityRegister::class.java)
            startActivity(intent)
        }
    }
}
