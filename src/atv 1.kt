fun main(){

    print("texto: ")
    val texto = readLine()

    println("Digite o indice inicial: ")
    val indiceInicial = readLine()?.toIntOrNull() ?: 0

    println("Digite o indice final: ")
    val indiceFinal  = readLine()?.toIntOrNull() ?: texto?.length

    println(texto?.substring(indiceInicial, indiceFinal!!))
}