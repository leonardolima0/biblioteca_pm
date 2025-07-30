package com.example.appbiblioteca4321

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListaLivrosActivity : AppCompatActivity() {

    private lateinit var listaLivroView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_livros)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listaLivro = listOf("Título 1", "Título 2", "Título 3")

        listaLivroView = findViewById(R.id.lista_Livro)
        listaLivroView.adapter = ArrayAdapter(
            this,
            android.R.layout.activity_list_item,
            android.R.id.text1,
            listaLivro
        )
    }
}