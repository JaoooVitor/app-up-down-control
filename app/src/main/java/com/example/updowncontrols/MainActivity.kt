package com.example.updowncontrols

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Referências aos componentes da interface
        val txtContador = findViewById<TextView>(R.id.activity_main_txt_contador)
        val btnAumentar = findViewById<Button>(R.id.activity_main_btn_aumentar)
        val btnDiminuir = findViewById<Button>(R.id.activity_main_btn_diminuir)

        // Atualiza o TextView com o valor inicial
        txtContador.text = contador.toString()

        // Aumentar contador
        btnAumentar.setOnClickListener {
            contador++
            txtContador.text = contador.toString()
        }

        // Diminuir contador
        btnDiminuir.setOnClickListener {
            if (contador > 0) {
                contador--
                txtContador.text = contador.toString()
            }
        }

    }
}