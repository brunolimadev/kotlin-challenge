class ProfessorTitular(
    codigo: Int,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    val especialidade: String
): Professor(nome,sobrenome, tempoDeCasa, codigo ) {
}