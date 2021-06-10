class ProfessorAdjunto(
    codigo: Int,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    val qtdHorasMonitoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigo) {

}