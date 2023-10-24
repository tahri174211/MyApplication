package com.example.myapplication

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.DialogInterface
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class AddRequestActivity : AppCompatActivity() {
    private lateinit var editTextTitle: EditText
    private lateinit var editTextDescription: EditText
    private lateinit var ok: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_request)

        editTextTitle = findViewById(R.id.service)
        editTextDescription = findViewById(R.id.description)
        ok = findViewById(R.id.ok)

        ok.setOnClickListener {
            // Afficher une boîte de dialogue de confirmation
            showConfirmationDialog()
        }
    }

    private fun showConfirmationDialog() {
        AlertDialog.Builder(this)
            .setTitle("Confirmer l'ajout de la demande")
            .setMessage("Êtes-vous sûr de vouloir ajouter cette demande ?")
            .setPositiveButton("Oui") { dialog, which ->
                // L'utilisateur a confirmé, affichez ProgressDialog
                showProgressDialog()
            }
            .setNegativeButton("Non", null)
            .show()
    }

    private fun showProgressDialog() {
        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Enregistrement de la demande...")
        progressDialog.setCancelable(false)
        progressDialog.show()

        // Simulez un travail en arrière-plan pendant quelques secondes
        Handler().postDelayed({
            progressDialog.dismiss()

            // Une fois le travail terminé, affichez la page avec les informations entrées
            val title = editTextTitle.text.toString()
            val description = editTextDescription.text.toString()

            // Affichez la nouvelle page avec les informations
            showRequestDetailsPage(title, description)
        }, 3000) // Simule 3 secondes de travail
    }

    private fun showRequestDetailsPage(title: String, description: String) {
        // Vous pouvez afficher la nouvelle page avec les informations ici
    }
}
