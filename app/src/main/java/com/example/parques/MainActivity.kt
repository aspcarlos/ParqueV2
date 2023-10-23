package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val miDialogo = MiDialogFragment()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Tag = "NombreParque ";
        val TagCasillas = "Casillas ";
        val TagSpinner = "Spinner ";

        binding.Boton.setOnClickListener {
            miDialogo.show(supportFragmentManager, "MiDialogo")

            Log.d(Tag, "el parque es: " +binding.Nombre.text + "\n")
            if (binding.DeportesCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.DeportesCheckBox.text + "\n")
            }
            if (binding.ParqueInfantilCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.ParqueInfantilCheckBox.text + "\n")
            }
            if (binding.RestauranteCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.RestauranteCheckBox.text + "\n")
            }
            if (binding.ZonaDeMascotasCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.ZonaDeMascotasCheckBox.text + "\n")
            }

            Log.d(TagSpinner, "el parque Abre: " +binding.HorarioAperturaSpinner.selectedItem + "\n")
            Log.d(TagSpinner, "el parque Cierra: " +binding.HorarioCierreSpinner.selectedItem + "\n")

        }
    }

}