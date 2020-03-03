package br.senai.sp.jandiraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //*** Instanciando as classes referentes aos
        //*** Componentes (View) da activity



        val buttonCalcular = findViewById<Button>(R.id.button_calcular)


        val editTextPeso=findViewById<EditText>(R.id.edit_text_peso)

        val editTextAlura=findViewById<EditText>(R.id.edit_text_altura)

       // val buttonAbrir = findViewById<Button>(R.id.button_resultado)

        //**** Criar um ouvinte para o botão abrir
        //**** que vai abrir outra activity

      /*
       exemplo de intent
       buttonAbrir.setOnClickListener {
                                                            //this Contesto
            val abrirActivityResultado = Intent(this, ResultadoActivity::class.java)
            //Colocando carona
            abrirActivityResultado.putExtra("peso",editTextPeso.text.toString())
            abrirActivityResultado.putExtra("altura", editTextAlura.text.toString())
            startActivity(abrirActivityResultado)


        }*/

        //**** Declarar variaveis que receberao os valores dos editTexts

        var peso: Double
        var altura : Double
        var imc : Double
        var mensagem:String


        buttonCalcular.setOnClickListener {
            //***recupera os valores digitados
            //***e atribui as variaveis
           // peso = editTextPeso.text.toString().toDouble()
            //altura = editTextAlura.text.toString().toDouble()
            //*** calcular o valor do IMC
            // imc=peso/(altura*altura)
            //*** Determinar a situaçao do usuario

            //:: e = new em java
            val abiriActivityResultado= Intent (this,ResultadoActivity::class.java)

            abiriActivityResultado.putExtra("peso" , editTextPeso.text.toString())
            abiriActivityResultado.putExtra("altura", editTextAlura.text.toString())

            startActivity(abiriActivityResultado)


        }
    }
}
