fun main(){

    var nome: String? = null
    val sobre: String = "D'Silva"

    println("Nome $nome Sobre $sobre")

    val ano = "2000s"//input
    val anoInt = ano.toIntOrNull() ?: 0



        val idade = 2026 - anoInt

        println("idade: $idade")

        println("Erro")

}