package br.com.edson.section08._0801

fun main() {
    val students = getStudents()

    // Nesse caso a lambda tem mais de um parâmetro
    // por isso precisamos declara-lo que no caso seria o s
    val combos = students.map() {s -> "${s.name} : ${s.age}"}
    println(combos)

    // Nesse caso como temos apenas 1 parametro
    // podemos utlizar o defaul que se chama it
    println("The oldest student is: ${students.maxByOrNull { it.age }}")

    // Flitrando os alunos com nome maior que 5 caracteres
    println("Student with longest name is: ${students.filter { it.name.length > 5 }}")


}