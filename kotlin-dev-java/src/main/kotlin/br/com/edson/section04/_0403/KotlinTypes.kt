package br.com.edson.section04._0403

fun main() {

    // Inferencia de Tipos
    val myPhrase = "I'm a String"
    val myPi = 3.14
    val myAnswer = 42

    // Sem Inferencia de Tipos
    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 10192834710928374L
    val myInt = 199

    // Nesse caso o Kotlin pode confundir com Inteiro
    // Por isso temos que explicitar qual o tipo
    val myShort: Short = 12
    val myByte: Byte = -128

    // O Kotlin não arredonda numeros durante as conversoes
    // Os valores Double sao um padrao quando o numero tem um .
    // Podemos utilizar um _ para tornar as casas decimais mais legiveis
    val aLong = 123_456_789L

    // No Kotlin precisamos explicitar as conversoes, mesmo que seja para
    // um tipo maior
    val newInt: Int = 7
    val newLong : Long = newInt.toLong()

}