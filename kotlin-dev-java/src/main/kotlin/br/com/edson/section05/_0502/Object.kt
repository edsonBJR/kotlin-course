package br.com.edson.section05._0502

fun main() {

    // Assim como em Javascript os objetos nao precisam de classe para serem criados
    // eles sao entidades por si mesmo e para criar um objeto utilizamos o tipo
    // Object, podemos cria-lo dentro da funcao ou externamente
    // Objetos sao como qualquer outra variave
    // seu suas propriedade forem var podemos altera-las tambem


    // Criando objetos dentro da funcao
    // Aqui estamos trabalhando com
    // Object Type
    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Cordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    // Aqui estamos trabalhando com
    // Object Type
    val location2 = object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt() {
            println("Cordinates = (${xCoordinate}, ${yCoordinate})")

        }
    }
    location2.printIt()
    location2.xCoordinate = 3000
    location2.yCoordinate = 6000

    location2.printIt()

    // Dentro da Funcao estamos utilizando no Object Declaration
    val temperature = MySingleton.getLastTempeture()
    println("Last temperature measured = $temperature degress!")
}

// Object Declaration e um instrucao e nao uma expressa, diferente de Object Type
// Nao pode ser declarado localmente como em uma funcao
// mas pode ser aninhado a um outro objeto para criar uma declaracao de Objeto
object MySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTempeture() = temperatures.last()
}
