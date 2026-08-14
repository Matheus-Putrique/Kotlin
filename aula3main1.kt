class Pessoa(val nome: String){
    init{
        println("Criando pessoinha...")
    }
    fun bomdia(){
        println("Bom dia $nome!")
    }

    constructor(nome: String, idade: Int): this(nome){

    }
    companion object{
        fun umacoisalegal(){
            println("fazendo uma coisa legal |o| :') :3 xD")
        }
    }
}


fun main(){
    val p1 = Pessoa("Pedro")
    val p2 = Pessoa("Pedrão", 21)
    println(p1.nome)
    p1.bomdia()
    println(p2.nome)
    p2.bomdia()

    Pessoa.umacoisalegal() // ver dps
}