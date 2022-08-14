package br.com.edson.section08._0807

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun main() {
    /*
        Uma Partial Application utiliza um funcao
        que aceita alguns argumentos vinculando valores
        a um ou mais desses argumentos e retorna uma nova
        funcao que aceita apenas os argumentos nao vinculados
        restantes

        Partials Applications and Currying nos dao funcoes especializadas
        a partir de funcoes gerais sem introduzir duplicacoes de codigos

     */

    // _X_ - Adicionar valores antes e depois de uma String por exemplo
    val prefixAndPostFix: (String, String, String) -> String = {prefix: String, x: String, postFix: String
        -> "${prefix}${x}${postFix}"}

    val prefixAndAlert: (String, String) -> String = prefixAndPostFix.partially3("!")
    val hello: (String) -> String = prefixAndAlert.partially1("Hello, ")

    println(hello("World"))
}