fun main(){
    print("Quantas temperaturas serão informadas: ")
    val quantidade = readLine()?.toInt() ?: 0

    val temperaturas = FloatArray(quantidade)

    print("Digite a temperatura: ")
    temperaturas[0] = readLine()!!.toFloat()

    var maior = temperaturas[0]
    var menor = temperaturas[0]


    for(i in 1 until quantidade ){
        print("Digite  as temperaturas: ")
        temperaturas[i] = readLine()!!.toFloat()

        if(temperaturas[i] > maior){
            maior = temperaturas[i]
        }
        if(temperaturas[i] < menor){
            menor = temperaturas[i]
        }
    }
    println("Maior temperatura registrada: $maior")
    println("Menor temperatura registrada: $menor")
}