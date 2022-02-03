package one.inovation.digital.collections

fun main(){

    val salarios = doubleArrayOf(100.30, 200.40, 300.50)

    for(salario in salarios){
        println(salario)
    }

    println("---------------------")
    println("Maior salário - "+ salarios.maxOrNull())   // retorna valor maximo
    println("Menor salário - " + salarios.minOrNull())  // retorna valor minimo
    println("Média salarial - " + salarios.average())   // retorna media

    val salariosFilterMaiorQue100 = salarios.filter { it > 100.30 }  // filtra os valores de acordo com determinada condição
    println("---------------------")
    salariosFilterMaiorQue100.forEach{ println(it)}

    println("---------------------")
    println(salarios.count{it in 100.31..300.51})   // retorna valores de acordo com determinado range

    println("---------------------")
    println(salarios.find{it == 100.30}) // encontra valor igual ao da expressão

    println("---------------------")
    println(salarios.any{it == 100.00}) // retorna true or false dependendo da condição
}