data class Produto(val nome: String, val preco: Double)

fun main(){

    val produtos = listOf(
        Produto("Celulares", 800.0),
        Produto("Cadeira", 45.0),
        Produto("Fone", 120.0),
        Produto("Caneta", 2.5),
        Produto("Monitor", 350.0)
    )

    val valorSuperior = produtos.filter{produto -> produto.preco >= 50.0}

    val listaSuperior = valorSuperior.map{produto -> produto.nome}

    println(listaSuperior)
}