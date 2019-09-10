package mx.edu.ittepic.tpdm_u1p1_mialbunfamiliar_vizcarracabrales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var imagen1 : ImageView ?= null
    var imagen2 : ImageView ?= null
    var imagen3 : ImageView ?= null
    var imagen4 : ImageView ?= null
    var imagen5 : ImageView ?= null
    var imagen6 : ImageView ?= null
    var imagen7 : ImageView ?= null
    var imagen8 : ImageView ?= null
    var imagen9 : ImageView ?= null
    var imagen10 : ImageView ?= null
    var imagen11 : ImageView ?= null
    var imagen12 : ImageView ?= null
    var imagen13 : ImageView ?= null
    var imagen14 : ImageView ?= null
    var imagen15 : ImageView ?= null
    var imagen16 : ImageView ?= null
    var imagen17 : ImageView ?= null
    var imagen18 : ImageView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagen1 = findViewById(R.id.i1)
        imagen2 = findViewById(R.id.i2)
        imagen3 = findViewById(R.id.i3)
        imagen4 = findViewById(R.id.i4)
        imagen5 = findViewById(R.id.i5)
        imagen6 = findViewById(R.id.i6)
        imagen7 = findViewById(R.id.i7)
        imagen8 = findViewById(R.id.i8)
        imagen9 = findViewById(R.id.i9)
        imagen10 = findViewById(R.id.i10)
        imagen11 = findViewById(R.id.i11)
        imagen12 = findViewById(R.id.i12)
        imagen13 = findViewById(R.id.i13)
        imagen14 = findViewById(R.id.i14)
        imagen15 = findViewById(R.id.i15)
        imagen16 = findViewById(R.id.i16)
        imagen17 = findViewById(R.id.i17)
        imagen18 = findViewById(R.id.i18)

        imagen1?.setOnClickListener { abrir(R.drawable.img1, "Mi novia y yo en la posada de la EyBDG del año pasado.") }
        imagen2?.setOnClickListener { abrir(R.drawable.img2, "Mi novia, su hermanita y yo en el jaripeo de 'El Roble'.") }
        imagen3?.setOnClickListener { abrir(R.drawable.img3, "Mi novia y yo en el camión, llendo a su casa despues de clases.") }
        imagen4?.setOnClickListener { abrir(R.drawable.img4, "Mi novia y yo en el partido de 'Uruguay vs Mexico' en Nuevo Leon.") }
        imagen5?.setOnClickListener { abrir(R.drawable.img5, "Mi novia y yo en el TEC de Nuevo Leon, despues de la inauguración del Prenacional de EyBDG.") }
        imagen6?.setOnClickListener { abrir(R.drawable.img6, "Mi novia y yo en el camión, rumbo al TEC.") }
        imagen7?.setOnClickListener { abrir(R.drawable.img7, "Mi novia y yo comiendo sandia en la playa.") }
        imagen8?.setOnClickListener { abrir(R.drawable.img8, "Mi novia y yo haciendo tarea en el pasto del TEC.") }
        imagen9?.setOnClickListener { abrir(R.drawable.img9, "Mi novia y yo en el cerro de Dios en 'El Roble'.") }
        imagen10?.setOnClickListener { abrir(R.drawable.img10, "Mi novia y yo, la primera vez que salimos juntos.") }
        imagen11?.setOnClickListener { abrir(R.drawable.img11, "Mi novia y yo en el TEC de Cancun.") }
        imagen12?.setOnClickListener { abrir(R.drawable.img12, "Mi novia y yo en Vallarta.") }
        imagen13?.setOnClickListener { abrir(R.drawable.img13, "Mi novia y yo llegando a mi casa anterior.") }
        imagen14?.setOnClickListener { abrir(R.drawable.img14, "Mi novia y yo creando una antena casera.") }
        imagen15?.setOnClickListener { abrir(R.drawable.img15, "Mi novia y yo cuando fuimos a realizar una entrevista a una refaccionaria.") }
        imagen16?.setOnClickListener { abrir(R.drawable.img16, "Mi novia, mi madre y yo en la playa.") }
        imagen17?.setOnClickListener { abrir(R.drawable.img17, "Mi novia, su hermano y yo en el pollo feliz despues de haber ido al torneo de Tae-Kwon-Do.") }
        imagen18?.setOnClickListener { abrir(R.drawable.img18, "Mi novia, su hermanita, su abuela y su mamá, junto con mi mamá y mis padrinos en mi bautizo.") }
    }

    fun abrir (imagen : Int, descrpcion : String){
        var abrirImagen = Intent(this, Main2Activity::class.java)
        abrirImagen.putExtra("imagen",imagen)
        abrirImagen.putExtra("descripcion",descrpcion)
        startActivity(abrirImagen)
    }
}
