package mx.edu.ittepic.tpdm_u1p1_mialbunfamiliar_vizcarracabrales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    var imagen : ImageView ?= null
    var descripcion : TextView ?= null
    var regresar : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imagen = findViewById(R.id.imagen)
        descripcion = findViewById(R.id.descripcion)
        regresar = findViewById(R.id.regresar)

        imagen?.setImageResource(intent.extras!!.getInt("imagen"))
        descripcion?.setText(intent.extras!!.getString("descripcion"))
        regresar?.setOnClickListener { finish() }
    }
}
