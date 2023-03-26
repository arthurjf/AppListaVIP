package br.com.arthurjf.cursoandroid.applistavip.model

class Person {
    var firstName: String? = null
    var lastName: String? = null
    var courseName: String? = null
    var phoneNumber: String? = null

    constructor(firstName: String, lastName: String, courseName: String, phoneNumber: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.courseName = courseName
        this.phoneNumber = phoneNumber
    }

    constructor()
}