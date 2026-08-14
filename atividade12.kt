data class Tarefa (val nome: String, val concluida: Boolean)

fun main(){
    val ListaTarefas = listOf(
        Tarefa("Escovar os dentes", true),
        Tarefa("Lavar o chão", false),
        Tarefa("Lavar o prato", false),
        Tarefa("Encher a garrafa", true)
    )
    val tarefasAcumprir = ListaTarefas.filter{tarefa -> tarefa.concluida == false}.map{tarefa -> tarefa.nome}

    println(tarefasAcumprir)
}