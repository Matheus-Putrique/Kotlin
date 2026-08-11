fun main(){
    println("Digite a primeira nota: ")
    val n1: Float? = readLine()?.toFloatOrNull()

    println("Digite a segunda nota: ")
    val n2: Float? = readLine()?.toFloatOrNull()

    println("Digite a terceira nota: ")
    val n3: Float? = readLine()?.toFloatOrNull()

    if(n1 != null && n2 != null && n3 != null){
        val media = (n1 + n2 + n3) / 3
        println("Média : $media")
    }
    else{
        println("Digite notas válidas")
    }
}