package es.jmarara529.listviewpersonalizado_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jmarara529.listviewpersonalizado_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var miAdaptador: AdaptadorAlumno
    private val miListaAlumnos = mutableListOf(
        Alumno("Jose", "Maroto", "Hombre", "DAM"),
        Alumno("Maria", "Lopez", "Mujer", "DAW"),
        Alumno("Juan", "", "Hombre", "ASIR"),
        Alumno("Ana", "Garcia", "Mujer", "DAM"),
        Alumno("Pedro", "Martin", "", "DAW"),
        Alumno("Laura", "Rodriguez", "Mujer", "ASIR"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        miAdaptador = AdaptadorAlumno(this, R.layout.modulos_item, miListaAlumnos)
        binding.listv.adapter = miAdaptador

        binding.listv.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val alumnoSeleccionado = miListaAlumnos[position]

            val intent = Intent(this, if (alumnoSeleccionado.modulo == "DAM") {
                Dam_activity::class.java
            } else if (alumnoSeleccionado.modulo == "DAW") {
                Daw_activity::class.java
            } else {
                Asir_activity::class.java
            })

            startActivity(intent)

        }


        //setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}