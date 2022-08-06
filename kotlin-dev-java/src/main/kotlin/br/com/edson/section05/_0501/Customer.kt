package br.com.edson.section05._0501

class Customer internal constructor(firstName: String, lastName: String) {

    // Se nossa classe precisar de um modificador de visibilidade ou anotation ela entao deve incluir
    // um construtor primario

    init {
        println("Created a customer named $firstName $lastName")
    }

    // Se precisarmos de um construtor secundario devemos chamar o construtor primario
    // por meio da palavra this como no exemplo abaixo

    constructor(firstName: String, lastName: String, middleName: String): this(firstName, lastName)

}