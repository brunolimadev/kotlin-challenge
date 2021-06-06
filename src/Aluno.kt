class Aluno(
    val nome: String,
    val sobrenome: String,
    val codigo: Int
){

    override fun equals(other: Any?): Boolean {
        val outroAluno = other as? Aluno

        if(outroAluno?.codigo == this.codigo){
            return true
        }
        return false
    }
}