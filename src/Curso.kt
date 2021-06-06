class Curso (val nome: String, val codigo: Int){

    override fun equals(other: Any?): Boolean {
        val outroCurso = other as? Curso
        if(this.codigo == outroCurso?.codigo) return true
        return false;
    }
}