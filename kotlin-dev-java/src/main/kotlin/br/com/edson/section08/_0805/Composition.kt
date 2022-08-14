package br.com.edson.section08._0805

import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

fun main() {

    // Utilizacao do metodo compose da funKTionale
    // para juntar dois metodos em um

    val add5 = {i: Int -> i + 5}
    val multiplyBy2 = {i: Int -> i * 2}

    // O metodo compose combina as duas funcoes como se fossem apenas uma
    // Ele usa o resultado da segunda funcao como
    // parametro da primeira
    val multiplyBy2AndAdd5 = add5 compose multiplyBy2

    val composeResult  = multiplyBy2AndAdd5(10)
    println("MultiplyBy2AndAdd5(10) = $composeResult")

    // ForwardCompose aplica a funcao na ordem oposta
    // Ele executa a primeira e passa o resultado como parametro para a segunda
    val add5AndMultiplyBy2 = add5 forwardCompose multiplyBy2

    val forwardComposeResult  = add5AndMultiplyBy2(10)
    println("Add5AndMultiplyBy2(10) = $forwardComposeResult")

}