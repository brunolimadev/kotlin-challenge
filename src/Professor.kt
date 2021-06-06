abstract class Professor(
    val nome: String,
    val sobrenome: String,
    val tempoDeCasa: Int,
    val codigo: Int
) {
    override fun equals(other: Any?): Boolean {
        val outroProfessor = other as? Professor
        if(this.codigo == outroProfessor?.codigo) return true
        return false
    }
}