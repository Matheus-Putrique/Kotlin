class pessoa(val nome: String, val idade: Int){
    init{
        println("Criado pessoa")
    }
}
fun main(){
    val p1 = pessoa("Jose", 23)
    val p2 = pessoa("Miguel", 29)

    println("${p1.nome} ${p1.idade}")
    println("${p2.nome} ${p2.idade}")
}
