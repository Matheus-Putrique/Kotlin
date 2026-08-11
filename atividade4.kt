fun main(){
    println("Digite um texto: ")

    val texto: String = readln()

    val textoFormatado = texto.replace(" ", "-")

    println(textoFormatado)
}