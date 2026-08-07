fun main(){
    val nome: String ="Joselito"
    val sobre: String? = "D'Silva"

    println("Nome $nome Sobre $sobre")

    val nomeCompleto = nome + sobre
    var nomeCompleto2 = "$nome  $sobre  Sauro"

    println(nomeCompleto)
    println(nomeCompleto.length)
    println(nomeCompleto[3])
    println(nomeCompleto.substring(2, 5))

    nomeCompleto2 = nomeCompleto2.replace("D'Silva", "José")
    println(nomeCompleto2)

    println(nomeCompleto2.split("e"))
}