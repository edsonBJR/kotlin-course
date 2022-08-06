package br.com.edson.section05._0503

fun main() {

    // As interfaces em Kotlin sao parecidas com as do Java
    // ambas tem implementacoes de metodos que sao semelhantes as
    // classes abstratas, mas diferente das abstratras as interfaces
    // nao pode armazenar o estado elas afirmam qual metodo deve ser
    // definido por qual usuario da interface

    val myCar = Car()
    myCar.start()
    println("My car's make = ${myCar.automakerName}")
}