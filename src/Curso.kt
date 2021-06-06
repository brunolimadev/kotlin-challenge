class Curso(
    val nome: String,
    val codigo: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val qtdMaximaDeAlunos: Int
){

    val listaDeAlunos = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        val outroCurso = other as? Curso
        if(this.codigo == outroCurso?.codigo) return true
        return false;
    }
}