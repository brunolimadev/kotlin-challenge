class ProfessorAdjunto(
    codigo: Int,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    val qtdHotasMonitoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigo) {

}