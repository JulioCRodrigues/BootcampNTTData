package one.inovation.digital.collections

fun main(){

    val nomes = Array<String>(3){""}    //usar a classe Array, definir tipo e tamanho do array

    nomes[0] = "Mateus"
    nomes[1] = "Anita"
    nomes[2] = "Lucas"

    for(nome in nomes){    //iterando o array para exibir os valores
        nomes.sort()
        println(nome)
    }


}