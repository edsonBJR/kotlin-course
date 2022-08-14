package br.com.edson.section08._0804

import org.funktionale.collections.destructured

fun main() {

    val(head, tail) = listOf(1,2,3,4,5,6,7,8,9).destructured()

    println("Head = $head and tail = $tail")
}