package br.com.edson.section07._0702

fun main() {

    // Sobrecarga de Operadores
    // Utilizada quando precisamos Criar um classe que
    // fara a operacao de determinados valores para um caso especifico

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    println(c3)
}