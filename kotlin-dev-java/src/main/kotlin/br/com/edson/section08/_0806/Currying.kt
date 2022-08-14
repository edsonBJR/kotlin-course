package br.com.edson.section08._0806

import org.funktionale.currying.curried

fun main() {

    /*
        Currying - Encadeamento de Funcao
        Na pratica pega uma funcao que tem varios argumentos e
        transforma ela em uma cadeia de funcoes
        Sendo que cada uma delas tera um argumento
        Assim teremos uma funcao para cada argumento
        da funcao original
     */

    val sum3ints = {x: Int, y: Int, z: Int -> x + y + z}

    val curried: (Int) -> (Int) -> (Int) -> Int = sum3ints.curried()
    val curriedResult = curried(2)(4)(6)
    println("Curried (2)(4)(6) = $curriedResult")

}