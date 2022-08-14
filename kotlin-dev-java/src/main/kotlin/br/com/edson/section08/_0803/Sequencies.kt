package br.com.edson.section08._0803

fun main() {

    /*
        Sequences e o equivalente kotlin para streams em java
        Uma sequence e uma lazy evalueted collection ou seja
        uma colecao que tem uma verificacao tardia
        Uma diferenca que tem uma stream de uma sequence e a capacidade
        de rodar em varias CPU's
        A sequence nao e uma collection, um sequence nao e gerada ate que uma
        operacao seja finalizada, algo como uma soma ou um toList() seja invocado
        Por outro lado uma colecao sempre existe
     */

    var students = getStudents()

    // Aqui temos uma sequencia que extraiu de uma colecao
    // um intervalo de alunos, com excecao do primeiro e do ultimo aluno
    val sqStudents = students.drop(1).take(3).toList()
    println("Sequence students: $sqStudents")

    // Podemos criar uma sequence em tempo real com generateSequence
    val numbers = generateSequence(100) { it + 1 }
    println("Numbers: ${numbers.drop(5).take(20).toList()}")

    // Obter os numeros pares de uma sequencia de potencias de alguns
    // numeros
    val squares = generateSequence(1) { it + 1 }.map { it * it }
    val evenSquares = squares.filter { it % 2 == 0 }
    println("Even squares: ${evenSquares.take(5).toList()}")

    // Gerando uma Sequence de Fibonacci
    val fibonacci = generateSequence(1 to 1) { it.second to it.first + it.second }.map { it.first }
    println("Fibonacci: ${fibonacci.take(30).toList()}")

}