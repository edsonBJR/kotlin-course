package br.com.edson.section08._0802

fun closureMaker(): () -> Unit {

    // Na pratica um closures e quando as variaveis de um funcao
    // sao mantidas vivas apos a execucao da funcao

    var num = 0
    return { println(num++)}
}

fun main() {
    val myCounter1 = closureMaker()
    val myCounter2 = closureMaker()

    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()

    // Aqui nosso contador estara valendo 4
    // porque o valor dentro da closure da val num
    // e mantido e dado sequencia nele na proxima chamada
    myCounter1()
}