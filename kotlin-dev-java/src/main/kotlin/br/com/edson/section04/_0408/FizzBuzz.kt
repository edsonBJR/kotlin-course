package br.com.edson.section04._0408

fun main() {
    println(fizzBuzz(20))
}

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()

    for (it in 1 .. n) {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}