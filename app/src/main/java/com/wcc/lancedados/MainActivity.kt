package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* variaveis */
        val botaoLancarDados = findViewById<Button>(R.id.lanceDadoBotao)
        val valorDado1 = findViewById<TextView>(R.id.dado1)
        val valorDado2 = findViewById<TextView>(R.id.dado2)

        /* botao para lancar dados */
        botaoLancarDados.setOnClickListener {
            valorDado1.text = lancarDados().toString()
            valorDado2.text = lancarDados().toString()
        }
    }

    /* retornar valor aleatorio entre 1 e 6 */
    fun lancarDados(): Int {
        return (1..6).random()
    }
}