fun main(){
    println("Texto: ")
    val texto : String? = readLine() ?: "Indefinido"


    println(texto?.length)
}