package com.example.parques

import android.R
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class MiDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Confirmación"
            val content = "¿Está seguro de que desea guardar los datos?"
            val builder: AlertDialog.Builder = AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(R.string.ok) { dialog, which ->
                    //Callback para el ok
                    Toast.makeText(requireActivity().applicationContext,
                        "Se ha realizado la accion", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton(R.string.cancel) { dialog, which ->
                    //Callback para el Cancel
                    Toast.makeText(requireActivity().applicationContext,
                        "Se ha cancelado la accion", Toast.LENGTH_SHORT).show()
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder
            return builder.create()
                ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
        }
    }
}