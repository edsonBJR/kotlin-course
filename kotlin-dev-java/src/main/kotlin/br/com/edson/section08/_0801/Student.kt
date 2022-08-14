package br.com.edson.section08._0801

data class Student(val name: String, val age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ada", 19),
        Student("Manoel", 22),
        Student("Maria", 38),
        Student("Joao", 56),
        Student("Jose", 41)
    )
}
