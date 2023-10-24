package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ActivityLog : AppCompatActivity() {
    private var isPasswordVisible = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)


        val versRegisterTextView = findViewById<TextView>(R.id.versregister)
        val ediEditText = findViewById<EditText>(R.id.edi)
        val cnxImageView = findViewById<ImageView>(R.id.cnx)
        val ediEditTex = findViewById<EditText>(R.id.edi)

        versRegisterTextView.setOnClickListener {
            // Créer un Intent pour lancer ActivityRegister
            val intent = Intent(this, ActivityRegister::class.java)
            startActivity(intent)
        }
        cnxImageView.setOnClickListener {
            // Lorsque l'utilisateur clique sur le TextView, démarrez AddRequestActivity
            val intent = Intent(this, AddRequestActivity::class.java)
            startActivity(intent)

        }


        ediEditTex.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= (ediEditTex.right - ediEditTex.compoundDrawables[2].bounds.width())) {
                    // Cliquez sur l'icône de visibilité du mot de passe
                    isPasswordVisible = !isPasswordVisible
                    if (isPasswordVisible) {
                        ediEditTex.inputType = InputType.TYPE_CLASS_TEXT
                    } else {
                        ediEditTex.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                    }
                    return@setOnTouchListener true
                }
            }
            false
        }
    }
    }


