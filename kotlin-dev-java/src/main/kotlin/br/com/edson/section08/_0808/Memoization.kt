package br.com.edson.section08._0808

import org.funktionale.memoization.memoize

fun main() {

    /*
        O mesmo que memorizacao
        Uma maneira de melhorarmos o desempenho do codigo
        Podemos armazenar em cache o resultado de operacoes
        demoradas com base nas suas entradas nos parametros
        Para que essa tecnica funcione a funcao de memoization
        tem que ser pura
     */

    var fibonacci: (Long) -> Long = {it}

    fibonacci = {n: Long ->
        if(n < 2) n else fibonacci(n - 1) + fibonacci(n - 2)
    }

    var m: (Long) -> Long = {it}

    m = {n: Long ->
        if(n < 2) n else m(n - 1) + m(n - 2)
    }.memoize()

    println("Calling fibonacci: ${timeElapsed { m (40)}} ms")
    println("Calling fibonacci: ${timeElapsed { m (150)}} ms")

}

fun timeElapsed(body: () -> Unit): Long {
    val start = java.lang.System.currentTimeMillis()
    body()
    val end = java.lang.System.currentTimeMillis()
    return end - start
}