package sena.yamboro.registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sena.yamboro.registro.databinding.ActivityBusquedaBinding
import sena.yamboro.registro.databinding.ActivityWebBinding

class web : AppCompatActivity() {
    private lateinit var vinculo: ActivityWebBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_web)
        vinculo= ActivityWebBinding.inflate(layoutInflater)
        setContentView(vinculo.root)
        val una= intent.extras
        val otra= una?.getString("direccion")
        vinculo.web.loadUrl("https://${otra}")
    }
}