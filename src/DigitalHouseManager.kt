class DigitalHouseManager(
    val listaDeAlunos: MutableList<Aluno> = mutableListOf(),
    val listaDeProfessores: MutableList<Professor> = mutableListOf(),
    val listaDeCursos: MutableList<Curso> = mutableListOf(),
    listaDeMatriculas: MutableList<Matricula> = mutableListOf()
) : SystemManager(listaDeMatriculas) {
}