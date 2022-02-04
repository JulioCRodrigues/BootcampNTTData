package one.inovation.digital.collections

fun main() {
    val f1 = Funcionario("Joao", 1500.00)
    val f2 = Funcionario("Marta", 2400.00)
    val f3 = Funcionario("Bebeta", 850.00)

    val funcionarios = mutableListOf(f1, f2)
    funcionarios.forEach{ println(it) }

    println("-------------------") // adicionando novo funcionario na lista
    funcionarios.add(f3)
    funcionarios.forEach{ println(it) }

    println("-------------------") // removendo funcionario da lista
    funcionarios.remove(f1)
    funcionarios.forEach{ println(it) }

    println("--------  SET  -----------")
    val funcionarioSet = mutableSetOf(f1)
    funcionarioSet.forEach{println(it)}

    funcionarioSet.add(f3)
    funcionarioSet.add(f2)
    funcionarioSet.forEach{println(it)}
}