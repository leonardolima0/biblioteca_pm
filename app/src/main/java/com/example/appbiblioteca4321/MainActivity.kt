package com.example.appbiblioteca4321

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnCadastroUsuario = findViewById<Button>(R.id.cadastroUsuario)
        btnCadastroUsuario.setOnClickListener{
            val intent = Intent(this, UsuarioActivity::class.java)
            startActivity(intent)
            //Toast.makeText(this, "Você clicou no cadastro de usuario", Toast.LENGTH_LONG). show()
        }
        val btnBiblioteca = findViewById<Button>(R.id.biblioteca)
        btnBiblioteca.setOnClickListener {
            val intent = Intent(this, BibliotecaActivity::class.java)
            startActivity(intent)
            //Toast.makeText(this, "Você clicou na biblioteca", Toast.LENGTH_LONG).show()
        }
        val btnCadastroLivro = findViewById<Button>(R.id.cadastroLivro)
        btnCadastroLivro.setOnClickListener{
            val intent = Intent(this, LivroActivity::class.java)
            startActivity(intent)
            //Toast.makeText(this, "Você clicou no cadastro de Livro", Toast.LENGTH_LONG). show()
            }
    }
}