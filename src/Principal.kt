fun main() {
    val digitalHouseManager = DigitalHouseManager()

    val professorTitular1 = digitalHouseManager.registrarProfessorTitular("Walter", "White", 1000, "Full Stack")
    val professorTitular2 = digitalHouseManager.registrarProfessorTitular("Professor", "Girafales", 1001, "Android")

    val professorAdjunto1 = digitalHouseManager.registrarProfessorAdjunto("Jesse", "Pinkman", 5000, 0)
    val professorAdjunto2 = digitalHouseManager.registrarProfessorAdjunto("Will", "Smith", 5001, 0)

    val curso1 = digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    val curso2 = digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(curso1.codigo, professorTitular1.codigo, professorAdjunto1.codigo)
    digitalHouseManager.alocarProfessores(curso2.codigo, professorTitular2.codigo, professorAdjunto2.codigo)

    val aluno1 = digitalHouseManager.registrarAluno("Luke", "Skywalker", 1)
    val aluno2 = digitalHouseManager.registrarAluno("Darth", "Vader", 2)
    val aluno3 = digitalHouseManager.registrarAluno("Leia", "Organa", 3)
    val aluno4 = digitalHouseManager.registrarAluno("Fred", "Flintstone", 4)
    val aluno5 = digitalHouseManager.registrarAluno("Barney", "Rubble", 5)
    val aluno6 = digitalHouseManager.registrarAluno("Pedrita", "Flintstone", 6)

    digitalHouseManager.matricularAluno(aluno1.codigo, curso1.codigo)
    digitalHouseManager.matricularAluno(aluno2.codigo, curso1.codigo)
    digitalHouseManager.matricularAluno(aluno3.codigo, curso2.codigo)
    digitalHouseManager.matricularAluno(aluno4.codigo, curso2.codigo)
    digitalHouseManager.matricularAluno(aluno5.codigo, curso2.codigo)
    digitalHouseManager.matricularAluno(aluno6.codigo, curso2.codigo)

    
}
