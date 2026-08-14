open class Animal(val nome: String){
    open fun fazSom(){
        println("cocorico")
    }
}

class Papagaio(nome : String) : Animal(nome){
    override  fun fazSom(){
        println("aeiou!")
    }
}



fun main(){
    val a = Animal("Alex")
    val p = Papagaio("Loronibus")
    println(p.nome)

    a.fazSom()
    p.fazSom()
}