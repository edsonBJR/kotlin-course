package br.com.edson.section04._0406

fun main() {

    // While e Do while mesmo compartamento que no Java
    var x = 0

    while(x < 10) {
        println("x = $x")
        x+=3
    }

    println("#-----------#")

    do {
        println("x = $x")
        x-=3
    } while (x >= 0)

    println("#-----------#")

    // For
    // Um loop For classico tem os seguinte elementos
    // Inicializador do loop, Verificador do loop, Iterador do loop e o Corpo do loop
    // no Kotil e diferente do java
    // nao podemos alterar o valor de item, por exemplo incrementando ele
    for(item in 1 .. 10) {
        print("$item, ")
    }

    println("\n#-----------#")

    // Iterar em uma String com for
    for(ch in "Edson Barbosa Junior") {
        println(ch)
    }

    println("#-----------#")

    // Imprimindo um Index de um Array
    println()
    var index = 0
    for(item in 10.rangeTo(20).step(2)) {
        println("${++index}) $item, ")
    }
    println()

    println("#-----------#")

    println()
    for((indx, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${indx + 1}) $item, ")
    }
    println()

    println("#-----------#")

    println()
    // Aqui estamos iterando os elementos de um Array e utilizando
    // a propriedade .indices do array para obter o indice do mesmo
    val myArray = arrayOf(1,2,3,4,5,6,7,8,9)
    for(item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
    println()

}