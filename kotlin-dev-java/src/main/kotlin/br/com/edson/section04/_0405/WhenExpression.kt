package br.com.edson.section04._0405

fun main() {

    // No Kotlin a expressao When substitui
    // o switch classico com argumento e sem argumento

    // When com argumento
    // Muito parecido com Switch do Java
    val pizzasOrdered = 7

    when (pizzasOrdered) {
        0 -> println("Not Hungry")
        1 -> println("Hungry")
        2 -> println("Very Hungry")
        else -> println("Are you sure")
    }

    when (pizzasOrdered) {
        0 -> println("Not Hungry")
        1,2 -> println("Hungry")
        3 -> println("Very Hungry")
        else -> println("Are you sure")
    }

    // Podemos comparar Argumentos com resultados de outra expressao
    // Vamos por exemplo comparar se o valor passado e valido
    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    // Podemos comparar um Range ou um intervalo de valores
    when (pizzasOrdered) {
        0 -> println("We needs orders")
        in 1 .. 4 -> println("Got some orders")
        in 5 .. 9 -> println("Business is up")
        else -> println("Are you sure")
    }

    // Podemos comparar sem passar argumentos
    // Podemos substituir facilmente os if's no nosso codigo
    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered %2 == 1 -> println("Odd number ordered")
        pizzasOrdered %2 == 0 -> println("Even number ordered")
    }
}
