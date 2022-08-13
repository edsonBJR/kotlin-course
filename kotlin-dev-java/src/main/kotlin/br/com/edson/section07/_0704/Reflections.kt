package br.com.edson.section07._0704

fun main() {

    // As reflections nos permitem acessar informacoes programaticas
    // dos nossos objetos dinamicamente em runtime
    // na verdade a maioria dos frameworks que utilizamos no dia a dia
    // costumam utilizar reflections
    // para minimizar o runtime do Kotlin as APIs sao mantidas em um arquivo
    // .jar separado
    // por isso vamos ter que adicionar mais um dependencia em nosso projeto

    val person = Person("Edson", "Barbosa")

    val kClass = person::class

    println("Simple name  = $kClass")
    println("Simple name  = ${kClass.simpleName}")

    println("#---------------------------------------------#")

    for (fields in kClass.members) {
        println("Property name = $fields")
    }

    println("#---------------------------------------------#")

    for (fields in kClass.java.declaredFields) {
        println("Property name = $fields")
    }

    println("#---------------------------------------------#")

    for (fields in kClass.java.declaredFields) {
        println("Property name = ${fields.name}")
    }

    println("#---------------------------------------------#")

    for (constructor in kClass.constructors) {
        println("Constructor = $constructor")
        println("Constructor Return = ${constructor.returnType}")
        println("Constructor Parameters = ${constructor.parameters}")
    }

}