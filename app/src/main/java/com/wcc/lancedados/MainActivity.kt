package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.lanceDadoBotao)
        val dado1 = findViewById<ImageView>(R.id.dado1)
        val dado2 = findViewById<ImageView>(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            dado1.setImageResource(lancarDados())
            dado2.setImageResource(lancarDados())
        }

        val playerName = getIntent().getStringExtra("playerName")
        val playerNameTextView = findViewById<TextView>(R.id.textPlayerName)
        playerNameTextView.text = "Olá, $playerName"
    }

    fun lancarDados(): Int {
        return recuperaFaceDado(gerarNumero())
    }

    fun recuperaFaceDado(numero: Int): Int {
        return when(numero) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    fun gerarNumero(): Int {
        return (1..6).random()
    }
}