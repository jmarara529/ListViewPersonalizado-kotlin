package es.jmarara529.listviewpersonalizado_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import es.jmarara529.listviewpersonalizado_kotlin.databinding.ModulosItemBinding

class AdaptadorAlumno(private val miContext: Context,val resource: Int, private val listaAlumnos: List<Alumno>) : ArrayAdapter<Alumno>( miContext, resource, listaAlumnos ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val binding = if (convertView == null) {
            ModulosItemBinding.inflate(LayoutInflater.from(miContext), parent, false)
        } else{
            ModulosItemBinding.bind(convertView)
        }

        val iconoUsuario = mapOf(
            "Hombre" to R.drawable.usuariomasculino,
            "Mujer" to R.drawable.usuariofemenino,
            "" to R.drawable.usuarionoespecificado
        )

        val alumno : Alumno = listaAlumnos[position]

        binding.textNombreItem.text = alumno.nombre
        binding.textApellidoItem.text = alumno.apellidos
        binding.textModuloItem.text = alumno.modulo

        binding.imagenUsuario.setImageResource(iconoUsuario[alumno.sexo]!!)


        return binding.root

    }


}