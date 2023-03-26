package br.com.arthurjf.cursoandroid.applistavip.controller

import android.content.SharedPreferences
import br.com.arthurjf.cursoandroid.applistavip.model.Person
import br.com.arthurjf.cursoandroid.applistavip.view.MainActivity

class PersonController(mainActivity: MainActivity) {
    val PREFERENCES_NAME = "pref_listavip"
    val PREFERENCES_FIRSTNAME = "primeiroNome"
    val PREFERENCES_LASTNAME = "sobreNome"
    val PREFERENCES_COURSENAME = "nomeCurso"
    val PREFERENCES_PHONENUMBER = "telefoneContato"

    private val preferences: SharedPreferences =
        mainActivity.getSharedPreferences(PREFERENCES_NAME, 0)
    private val vipList: SharedPreferences.Editor = preferences.edit()

    fun save(person: Person) {
        vipList.putString(PREFERENCES_FIRSTNAME, person.firstName)
        vipList.putString(PREFERENCES_LASTNAME, person.lastName)
        vipList.putString(PREFERENCES_COURSENAME, person.courseName)
        vipList.putString(PREFERENCES_PHONENUMBER, person.phoneNumber)
        vipList.apply()
    }

    fun search(person: Person): Person {
        person.firstName = preferences.getString(PREFERENCES_FIRSTNAME, "")!!
        person.lastName = preferences.getString(PREFERENCES_LASTNAME, "")!!
        person.courseName = preferences.getString(PREFERENCES_COURSENAME, "")!!
        person.phoneNumber = preferences.getString(PREFERENCES_PHONENUMBER, "")!!

        return person
    }

    fun clear() {
        vipList.clear()
        vipList.apply()
    }
}