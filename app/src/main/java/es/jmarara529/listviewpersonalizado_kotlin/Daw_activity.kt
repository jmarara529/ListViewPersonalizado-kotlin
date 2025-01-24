package es.jmarara529.listviewpersonalizado_kotlin

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jmarara529.listviewpersonalizado_kotlin.databinding.ActivityDawBinding

class Daw_activity : AppCompatActivity(), View.OnClickListener {

    private  lateinit var binding: ActivityDawBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityDawBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(R.layout.activity_daw)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.button.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                finish()
            }
        }
    }
}