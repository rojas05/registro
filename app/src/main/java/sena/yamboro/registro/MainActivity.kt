package sena.yamboro.registro

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import sena.yamboro.registro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vinculo: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        vinculo= ActivityMainBinding.inflate(layoutInflater)
        setContentView(vinculo.root)

        val preferencias = getSharedPreferences("registrar", Context.MODE_PRIVATE)
        vinculo.reg.setOnClickListener {
            val registrar = Intent(this,registro::class.java)
              startActivity(registrar)
        }
        vinculo.ing.setOnClickListener {
            val usuarios = preferencias .getString("correo","")
            val clave = preferencias .getString("clave","")

            val user = vinculo.core.text.toString()
            val password = vinculo.pass.text.toString()
            if (usuarios.equals(user) and clave.equals(password)){
                val editor = preferencias.edit()
                editor.putString("sesion","1")
                editor.apply()
                startActivity( Intent(this,busqueda::class.java))
            }else{
                Toast.makeText(this, "datos erroneos", Toast.LENGTH_SHORT).show()
            }

        }

    }
}