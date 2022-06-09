package sena.yamboro.registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sena.yamboro.registro.databinding.ActivityBusquedaBinding
import sena.yamboro.registro.databinding.ActivityRegistroBinding

class busqueda : AppCompatActivity() {
    private lateinit var vinculo: ActivityBusquedaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_busqueda)
        vinculo= ActivityBusquedaBinding.inflate(layoutInflater)
        setContentView(vinculo.root)
        vinculo.lupa.setOnClickListener {
            val busca = Intent(this,web::class.java)
            busca.putExtra("direccion",vinculo.barra.text.toString())
            startActivity(busca)
        }
    }
}