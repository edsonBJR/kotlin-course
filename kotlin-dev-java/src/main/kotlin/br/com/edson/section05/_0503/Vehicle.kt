package br.com.edson.section05._0503

interface Vehicle {

    // Esse atributo precisa ser sobreescrito porque nao valor atribuido
    val automakerName: String

    // Esse metodo por ter um corpo ja e herdado automaticamente
    fun start() {
        println("Carro ligado....")
    }

    // Esse metodo por ter um corpo ja e herdado automaticamente
    fun stop() {
        println("Carro parado...")
    }

    // Esse metodo por ter um corpo ja e herdado automaticamente
    fun getKmPerLiter() : Int {
        return 17
    }

    // Esse metodo precisa ser sobreescrito porque nao tem corpo implementado
    fun getDoors(): Int
}