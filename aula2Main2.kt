fun executarOperacao(a: Int, b: Int, operacao: (Int, Int) -> Int): Int{
    return operacao(a, b)
}

fun main(){

    soma(2,3)
    sub(2, 1)

    executarOperacao(2,2,{a, b -> a + b * b })
}