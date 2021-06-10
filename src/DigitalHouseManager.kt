import kotlin.test.assertNull

class DigitalHouseManager(
    val listaDeAlunos: MutableList<Aluno> = mutableListOf(),
    val listaDeProfessores: MutableList<Professor> = mutableListOf(),
    val listaDeCursos: MutableList<Curso> = mutableListOf(),
    listaDeMatriculas: MutableList<Matricula> = mutableListOf()
) : SystemManager(listaDeMatriculas) {

    fun registrarCurso(nome: String, codigo: Int, qtdMaximaDeAlunos: Int): Curso {
        val curso = Curso(nome, codigo, qtdMaximaDeAlunos)
        this.listaDeCursos.add(curso)
        return curso
    }

    fun excluirCurso(codigoCurso: Int) {
        val cursoFiltrado = this.listaDeCursos.find { curso -> curso.codigo == codigoCurso }
        this.listaDeCursos.remove(cursoFiltrado)
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ): ProfessorAdjunto {
        val professor = ProfessorAdjunto(codigoProfessor, nome, sobrenome, tempoDeCasa = 0, quantidadeDeHoras)
        this.listaDeProfessores.add(professor)
        return professor
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ): ProfessorTitular {
        val professor = ProfessorTitular(codigoProfessor, nome, sobrenome, tempoDeCasa = 0, especialidade)
        this.listaDeProfessores.add(professor)
        return professor
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val professorFiltrado =
            this.listaDeProfessores.find { professor -> professor.codigo == codigoProfessor }
        this.listaDeProfessores.remove(professorFiltrado)
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int): Aluno {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        this.listaDeAlunos.add(aluno)
        return aluno
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val cursoFiltrado = this.listaDeCursos.find { curso -> curso.codigo == codigoCurso }
        val alunoFiltrado = this.listaDeAlunos.find { aluno -> aluno.codigo == codigoAluno }

        if (cursoFiltrado != null && alunoFiltrado != null) {
            val matricula = Matricula(alunoFiltrado, cursoFiltrado)
            if (cursoFiltrado.listaDeAlunos.size <= cursoFiltrado.qtdMaximaDeAlunos) {
                cursoFiltrado.listaDeAlunos.add(alunoFiltrado);
                this.listaDeMatriculas.add(matricula)
                println("Matrícula realizada com sucesso")
            } else {
                println("Não foi possível realizar sua mátricula. No momento, não há vagas disponíveis.")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val professorTitular =
            this.listaDeProfessores.find { professor -> professor.codigo == codigoProfessorTitular }
        val professorAdjunto =
            this.listaDeProfessores.find { professor -> professor.codigo == codigoProfessorAdjunto }
        val cursoFiltrado =
            this.listaDeCursos.find { curso -> curso.codigo == codigoCurso }

        cursoFiltrado?.professorAdjunto = professorAdjunto as ProfessorAdjunto
        cursoFiltrado?.professorTitular = professorTitular as ProfessorTitular
    }

}