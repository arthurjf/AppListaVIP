package br.com.arthurjf.cursoandroid.applistavip.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.arthurjf.cursoandroid.applistavip.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById<Button>(R.id.buttonFinish)).setOnClickListener{
            val userName = findViewById<EditText>(R.id.editPersonName).text.toString();
            val text = "Olá " + userName.trim() + " :)"
            Toast.makeText(applicationContext, text, Toast.LENGTH_LONG).show()
        }
    }
}