package one.inovation.digital.collections

fun main(){

    val f1 = Funcionario("Joao", 1500.00)
    val f2 = Funcionario("Marta", 2400.00)
    val f3 = Funcionario("Bebeta", 850.00)

    val funcionarios = listOf(f1, f2, f3)

    funcionarios.forEach{println(it)}

    println("----------------")
    println(funcionarios.find{it.nome == "Bebeta"})  // encontra funcionario Bebeta

    println("----------------")
    funcionarios.sortedBy { it.salario}.forEach { println(it) } // retorna funcionarios por salario ordenado do menor > maior

}

data class Funcionario(
    val nome: String,
    val salario: Double


)
{
    override fun toString(): String =

        """
            Nome: $nome
            Salario: $salario
            """.trimIndent()
    }

