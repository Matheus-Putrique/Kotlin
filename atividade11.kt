fun executarVariasVezes(quantidade : Int, acao: () -> Unit) {
    for(i in 1..quantidade){
        acao()
    }
}

fun main(){
    executarVariasVezes(3){
        println("Executando ação 1")
    }
    executarVariasVezes(5){
        println("Executando ação 2")
    }
}