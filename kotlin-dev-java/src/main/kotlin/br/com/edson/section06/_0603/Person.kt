package br.com.edson.section06._0603

// Tornar possivel modificar os atributos no construtor colocando o
// var na frente do atributo
class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String): this(firstName, lastName)

}