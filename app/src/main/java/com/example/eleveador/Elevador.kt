package com.example.eleveador

data class Elevador(
                    private val capacidadeTotal: Int = 5,
                    private val totalAndares: Int = 10
) {

    private var qtdPessoa: Int = 0
    private var andarAtual: Int = 0

    //Métodos privado
    private fun aumentarCapacidade(contador: Int) {
        qtdPessoa += contador
    }

    private fun diminuirCapacidade(contador: Int) {
        qtdPessoa -= contador
    }

    private fun aumentarAndar() {
        andarAtual += 1
    }

    private fun diminuirAndar() {
        andarAtual -= 1
    }

    //Métodos públicos
    fun entrarElevador(): String {
        if (capacidadeTotal > qtdPessoa) {
            aumentarCapacidade(1)
        } else {
            return "Capacidade máxima atingida !!"
        }
        return "Entrou alguém! \n Capacidade:$qtdPessoa/$capacidadeTotal"
    }

    fun sairElevador(): String {
        if (qtdPessoa > 0) {
            diminuirCapacidade(1)
        } else {
            return "Elevador vazio!!"
        }
        return "Saiu alguém! \n Capacidade:$qtdPessoa/$capacidadeTotal"
    }

    fun subirAndar(): String{
        if (andarAtual < totalAndares) {
            aumentarAndar()
        } else {
            return "Total de andares atingido !!"
        }
        return "Subiu para o andar: $andarAtual\nCapacidade:$qtdPessoa/$capacidadeTotal"
    }

    fun descerAndar(): String{
        if (andarAtual > 0) {
            diminuirAndar()
        } else {
            return "Elevador no térreo !!"
        }
        return "Desceu para o andar: $andarAtual\nCapacidade:$qtdPessoa/$capacidadeTotal"
    }

}
