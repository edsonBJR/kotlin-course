package br.com.edson.section04._0404

fun main() {

    val myInt = 199
    val aInt: Int  = 7

    // Ternario em Java
//    int lowest = (myInt < aInt) ? myInt : aInt;

    // No Kotlin a Expressao Acima, semelhante a um Ternario
    val lowest = if (myInt < aInt) myInt else aInt

    // Um exemplo pouco maior
    val temp = 25
    val isAirConditionerOn = if(temp >= 26) {
        println("It is hot here!!!")
        true
    } else {
        println("It is cold here!!!")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}