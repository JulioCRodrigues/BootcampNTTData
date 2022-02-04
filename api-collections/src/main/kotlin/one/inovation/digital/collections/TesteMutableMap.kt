package one.inovation.digital.collections

fun main() {
    val f1 = Funcionario("Joao", 1500.00)
    val f2 = Funcionario("Marta", 2400.00)
    val f3 = Funcionario("Bebeta", 850.00)

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(f1.nome, f1 )
    repositorio.create(f2.nome, f2 )
    repositorio.create(f3.nome, f3 )

    println(repositorio.findById(f1.nome))

    println("========== / ==========") // imprime todos os funcionarios
    repositorio.findAll().forEach{ println(it) }

    println("========== / ==========") // remove funcionario
    repositorio.remove(f2.nome)
    repositorio.findAll().forEach{ println(it) }

}