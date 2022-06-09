package sena.yamboro.registro

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import sena.yamboro.registro.databinding.ActivityMainBinding
import sena.yamboro.registro.databinding.ActivityRegistroBinding

class registro : AppCompatActivity() {
    private lateinit var vinculo: ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_registro)
        vinculo= ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(vinculo.root)

        val preferencias = getSharedPreferences( "registrar", Context.MODE_PRIVATE)

            vinculo.registr.setOnClickListener {
            val editor = preferencias.edit()
            val corre = vinculo.corre.text.toString()
            val contra = vinculo.contra.text.toString()
            val name = vinculo.Name.text.toString()
            editor.putString("nombre" ,name)
            editor.putString("clave" ,contra)
            editor.putString("correo" ,corre)
            editor.putString("sesion","1")
            editor.apply()
          Toast.makeText(this,"",Toast.LENGTH_SHORT).show()

        startActivity( Intent(this,busqueda::class.java))
        }
    }
}