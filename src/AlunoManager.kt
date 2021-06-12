class AlunoManager: SystemManager() {

    fun consultarCurso(aluno: Aluno){
       val matriculaFiltrada = SystemManager.listaDeMatriculas.find { matricula -> matricula.aluno.codigo == aluno.codigo }

        if(matriculaFiltrada != null){
            println("Olá ${matriculaFiltrada.aluno.nome}, você está matriculado(a) no curso: ${matriculaFiltrada.curso.nome}")
        }else{
            println("Não possível localizar sua matrícula. Por favor, verifique se os dados estão corretos")
        }
    }
}