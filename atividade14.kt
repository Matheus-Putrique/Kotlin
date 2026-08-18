class produto(val nome: String, val preco: Double){
    init{
        println("Produto cadastrado: $nome")
    }
}
fun main() {
    val p1 = produto("Arroz", 10.50)
    val p2 = produto("Feijão", 15.50)
    val p3 = produto("Macarrão", 8.90)
    val p4 = produto("Café", 20.60)



}
