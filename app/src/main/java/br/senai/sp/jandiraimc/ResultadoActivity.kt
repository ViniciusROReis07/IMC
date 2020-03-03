package br.senai.sp.jandiraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

       /* val textViewNome = findViewById<TextView>(R.id.text_view_nome)
        val textViewPeso=findViewById<TextView>(R.id.text_view_peso)
        val textViewAltura=findViewById<TextView>(R.id.text_view_altura)

        textViewNome.text= intent.getStringExtra("nome")
        textViewPeso.text=intent.getStringExtra("peso")
        textViewAltura.text=intent.getStringExtra("altura")*/

        var peso = intent.getStringExtra("peso")




        //Mensagem que aparece e some rapitamente da tela
        Toast.makeText(this, " peso =  "+peso, Toast.LENGTH_LONG).show()
    }
}
