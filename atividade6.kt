fun main(){
    println("Digite sua nota: ")
    val n1: Float = readLine()?.toFloatOrNull() ?: 0f

    when{
        n1 >= 9 -> println("A")
        n1 >= 7 -> println("B")
        n1 >= 5 -> println("C")
        n1 >= 3 -> println("D")
        else -> println("F")


    }
}