package br.com.edson.section05._0504

fun main() {

    // Generics no Java sao classes ou metodos criados para funcionarem
    // com diferente tipos de dados que sao mais ou menos similares

    // Funcao Generica que recebe dois parametros, podem ser Int, String, Double, Float
    // compara os valores e retorno o maior deles

    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(123_456_789L, 999_899_999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Alpha", "Omega")

    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")
}