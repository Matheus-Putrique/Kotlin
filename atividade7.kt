fun main(){
    val numeros = Array(5){ 0 }
    var soma = 0

    for(i in 0..4){
        println("Digite a nota ${i + 1}: ")
        numeros[i] = readLine()?.toInt() ?: 0
    }
    for(i in 0..4){
        soma += numeros[i]
    }

    println("Soma: $soma")
}