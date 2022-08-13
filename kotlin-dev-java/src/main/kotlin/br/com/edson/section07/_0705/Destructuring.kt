package br.com.edson.section07._0705

fun main() {

    // O Destructuring e uma maneira de extrairmos apenas os dados
    // que queremos de um objeto complexo
    // Temos a Classe Coordinates, por ela ser um Data Class o Kotlin
    // ja inclui mecanismos de Destructuring nessa classe

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 =  c1 + c2
    println(c3)

    println("#-------------------------------#")

    // Abaixo temos um destructuring
    // Conseguimos obter o valor de cada variavel
    // na ordem em que foram definidas em seu construtor
    val (xCoordinate, yCoordinate) = c3
    println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")

    println("#-------------------------------#")

    // Para cada variavel temos Components, no caso de Coordinates temos
    // Component1() e Component2()

    println("xCoordinate = ${c3.component1()}")

    // Para classe que nao sao Data Classes
    // o destructuring esta disponivel mas temos que fazer a conexao dos
    // componente do operador manualmente

    val myPoint = Point(5000, 500, 60000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}