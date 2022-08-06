package br.com.edson.section05._0501

//class Person constructor(firstName: String, lastName: String) {
class Person (firstName: String, lastName: String) {

    // Uma classe pode ter um construtor primario e varios construtores secundarios
    // Esse Constructor so e necessario se o construtor tiver alguma anotacao ou
    // um modificador de visibilidade e dentro do construtor primario nao podemos ter
    // nenhuma implementacao ou nenhum codigo
    // se queremos utilizar o construtor primario e queremos executar algo assim que
    // a classe e inicializada podemos utilizar a palavra chave init{}
    // e ai nos definimos o que ele ira fazer ao ser inicializada
    // quando instanciarmos a classe person automaticamento sera impresso em console
    // a mensagem abaixo por causa do init

    init {
        println("Created a person named $firstName $lastName")
    }

}