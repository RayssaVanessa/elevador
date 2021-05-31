package com.example.eleveador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //insntanciando meu obj elevador
    private val elevador = Elevador(totalAndares = 15)

    lateinit var btnSubir: Button
    lateinit var btnDescer: Button
    lateinit var btnEntrar: Button
    lateinit var btnSair: Button
    lateinit var txtStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubir = findViewById(R.id.bt_subir)
        btnDescer = findViewById(R.id.bt_descer)
        btnEntrar = findViewById(R.id.bt_entrar)
        btnSair = findViewById(R.id.bt_sair)
        txtStatus = findViewById(R.id.tv_status)

        btnSubir.setOnClickListener {
            atualizarStatus(elevador.subirAndar())
        }

        btnDescer.setOnClickListener {
            atualizarStatus(elevador.descerAndar())
        }

        btnEntrar.setOnClickListener {
            atualizarStatus(elevador.entrarElevador())
        }

        btnSair.setOnClickListener {
            atualizarStatus(elevador.sairElevador())
        }

    }

    fun atualizarStatus(status: String?) {
        txtStatus.text = status
    }

}