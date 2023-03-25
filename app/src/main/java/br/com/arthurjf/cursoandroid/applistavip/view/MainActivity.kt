package br.com.arthurjf.cursoandroid.applistavip.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.arthurjf.cursoandroid.applistavip.R
import br.com.arthurjf.cursoandroid.applistavip.model.Person

class MainActivity : AppCompatActivity(){

    private var editPersonName: EditText? = null
    private var editLastName: EditText? = null
    private var editCourseName: EditText? = null
    private var editPhoneNumber: EditText? = null
    private var person: Person? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPersonName = findViewById(R.id.editPersonName)
        editLastName = findViewById(R.id.editPersonLastName)
        editCourseName = findViewById(R.id.editPersonCourseName)
        editPhoneNumber = findViewById(R.id.editPersonPhoneNumber)

        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val buttonFinish = findViewById<Button>(R.id.buttonFinish)

        buttonClear.setOnClickListener { clearFields() }

        buttonSave.setOnClickListener{
            val personName = editPersonName?.text.toString()
            val personLastName = editLastName?.text.toString()
            val personCourseName = editCourseName?.text.toString()
            val personPhoneNumber = editPhoneNumber?.text.toString()

            person = Person(personName, personLastName, personCourseName, personPhoneNumber)

            Toast.makeText(applicationContext, "Salvo :)", Toast.LENGTH_SHORT).show()

            clearFields()
        }

        buttonFinish.setOnClickListener{
            var toastMessage = "Nenhum usuário encontrado"

            if(person != null){
                toastMessage = "Olá " + person?.firstName?.trim() + " :)"
            }

            Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
        }
    }

    private fun clearFields(){
        editPersonName?.setText("")
        editLastName?.setText("")
        editCourseName?.setText("")
        editPhoneNumber?.setText("")
    }
}