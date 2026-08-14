fun dobrar(numeros : List<Int>) : List<Int>{
    return numeros.map{numero -> numero * 2}
}
fun maior(numeros : List<Int>) : List<Int>{
    return numeros.filter{numero -> numero > 30}
}
fun escrita(numeros : List<Int>) {
    for(numero in numeros){
        println("Numero: $numero")
    }
}
fun main(){
    val numeros = listOf(10, 25, 40, 5, 80)

    val dobro = dobrar(numeros)
    print(dobro)

    val maior = maior(numeros)
    print(maior)

    val escrita = escrita(numeros)
    println(escrita)
}