package one.inovation.digital.collections

fun main(){
    val salarios = DoubleArray(3)

    salarios[0] = 100.50
    salarios[1] = 50.99
    salarios[2] = 45.70

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
        println(salarios[index])
    }


}