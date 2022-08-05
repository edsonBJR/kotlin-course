package br.com.edson.section04._0407

fun main() {
    // Aqui estamos vendo Arguemnt Named ou Argumento Nomeado
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("40 + 50 = ${myMathExpressionBodyFunction(40, 50)}")
    println("123 + 432 = ${myMathExpressionBodyWithInferenceFuction(123, 432)}")
    println("123 + 432 = ${myFunctionWithDefault(123, 432)}")
    println("123 + 432 = ${myFunctionWithDefault(123, 432, "Hello Edson!!!")}")

    // Nesse caso preciso informar qual o parametro que estou passando
    // porque ele espera como primeiro parametros um Int e nao uma String
    // e para evitar o erro tempos que explicitar o paramento que estamos passando
    // assim podemos passar fora de ordem ou apenas o que queremos
    println("Resultado Default = ${myFunctionWithDefault(message = "Hello Edson Barbosa Junior!!!")}")
}

fun myMathFunction(number1: Int, number2: Int) : Int {
    return number1 + number2
}

// Quando uma funcao e muito pequena com apenas um retorno
// podemos utilizar o expression body
// abaixo temos um funcao que soma dois valores e devolve o resultado
fun myMathExpressionBodyFunction(number1: Int, number2: Int) : Int = number1 + number2

// Agora com Inferencia de Tipo sem informar o retorno
fun myMathExpressionBodyWithInferenceFuction(number1: Int, number2: Int) = number1 + number2

// Podemos tambem setar um valor padrao caso nao seja passado nenhum valor para ela
// Isso pode nos ajudar a evitar muita sobrecarga como utilizamos no Java
fun myFunctionWithDefault(number1: Int = 1, number2: Int = 5, message: String = "Hi") : Int {
    val result = number1 + number2
    println(message)
    return result
}
