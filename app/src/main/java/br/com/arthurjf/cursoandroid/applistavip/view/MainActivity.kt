package br.com.arthurjf.cursoandroid.applistavip.view

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.arthurjf.cursoandroid.applistavip.R
import br.com.arthurjf.cursoandroid.applistavip.controller.CourseController
import br.com.arthurjf.cursoandroid.applistavip.controller.PersonController
import br.com.arthurjf.cursoandroid.applistavip.model.Person

class MainActivity : AppCompatActivity() {

    private var personController: PersonController? = null
    private var editPersonName: EditText? = null
    private var editLastName: EditText? = null
    private var editCourseName: EditText? = null
    private var editPhoneNumber: EditText? = null
    private var person: Person = Person()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personController = PersonController(this)
        personController?.search(person)

        //- Spinner -//
        val courseController = CourseController()
        val courseNamesListForSpinner = courseController.getCourseListForSpinner()
        val spinnerCourses = findViewById<Spinner>(R.id.spinnerCourseName)
        val adapter =
            ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                courseNamesListForSpinner
            )
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1)
        spinnerCourses.adapter = adapter

        //- Edit Fields-//
        editPersonName = findViewById(R.id.editPersonName)
        editLastName = findViewById(R.id.editPersonLastName)
        editCourseName = findViewById(R.id.editPersonCourseName)
        editPhoneNumber = findViewById(R.id.editPersonPhoneNumber)

        editPersonName?.setText(person.firstName)
        editLastName?.setText(person.lastName)
        editCourseName?.setText(person.courseName)
        editPhoneNumber?.setText(person.phoneNumber)

        //- Botões -//
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val buttonFinish = findViewById<Button>(R.id.buttonFinish)

        //- Botão LIMPAR -//
        buttonClear.setOnClickListener { clear() }

        //- Botão SALVAR -//
        buttonSave.setOnClickListener {
            val personName = editPersonName?.text.toString()
            val personLastName = editLastName?.text.toString()
            val personCourseName = editCourseName?.text.toString()
            val personPhoneNumber = editPhoneNumber?.text.toString()

            person = Person(personName, personLastName, personCourseName, personPhoneNumber)
            personController?.save(person)

            Toast.makeText(applicationContext, "Salvo :)", Toast.LENGTH_SHORT).show()
        }

        //- Botão FINALIZAR -//
        buttonFinish.setOnClickListener {
            val toastMessage = "Olá " + person.firstName?.trim() + " :)"

            Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
        }
    }

    private fun clear() {
        editPersonName?.setText("")
        editLastName?.setText("")
        editCourseName?.setText("")
        editPhoneNumber?.setText("")

        personController?.clear()
    }
}