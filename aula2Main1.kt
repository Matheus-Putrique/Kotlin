fun soma(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b: Int) = a - b

fun bomdia(nome: String){
    println("Bom dia  $nome!!")
}

fun dez(numeros: List<Int>){
    for(numero in numeros){
        val soma = numero + 10
        print("$soma,")
    }
}

fun elevado(numeros: List<Int>){
    for(numero in numeros){
        val elevar = numero * numero
        print("$elevar,")

    }
}

fun pares(numeros: List<Int>){
    for(numero in numeros){
        if(numero % 2 == 0){
            print("$numero,")
        }
    }
}


fun main(){
    println(soma(2,3))

    println(bomdia("Leo"))

    println(sub(5,4))

    val numeros = listOf(1,2,3,4,5)
    //(+10) - 11 12 13 14 15
    //(**2) - 1, 4, 9, 16, 25
    //(%2) - 2, 4

    println(dez(numeros))
    println(elevado(numeros))
    println(pares(numeros))
}