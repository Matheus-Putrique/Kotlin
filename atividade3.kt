fun main(){
    println("Digite um texto: ")
    val texto: String = readln() ?: ""

    val textoFormatado = texto.replace(" ", "").lowercase()

    val textoInvertido = textoFormatado.reversed()

    if(textoInvertido == textoFormatado){
        println("Texto é um palíndromo")
    }
    else{
        println("Texto não é um palíndromo")
    }
}