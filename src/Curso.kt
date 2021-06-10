class Curso(
    val nome: String,
    val codigo: Int,
    val qtdMaximaDeAlunos: Int
) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    val listaDeAlunos = mutableListOf<Aluno>()

    fun adicionarUmAluno(aluno: Aluno) {
        this.listaDeAlunos.add(aluno)
    }

    fun excluirAluno(aluno: Aluno) {
        this.listaDeAlunos.remove(aluno)
    }

    override fun equals(other: Any?): Boolean {
        val outroCurso = other as? Curso
        if (this.codigo == outroCurso?.codigo) return true
        return false;
    }
}