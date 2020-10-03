fun main(){

    var profA = ProfessorAdjunto("John", "Fante",71,100, 30)
    var profT= ProfessorTitular("Robert", "Crumb", 41,343, "Kotlin")
    var curso = Curso("Sistemas para Internet", 61, profT, profA, 5)
    var aluno1 = Aluno("Luis Felipe", "Maior", 123)
    var aluno2 = Aluno("Joana", "Pires", 543)
    var matricul = Matricula(curso, aluno1)
    var dHouse= DigitalHouseManager()

    dHouse.registrarCurso("Sistemas para Internet", 321, 3 )
    dHouse.registrarProfessorTitular("Sabrina", "Um", 1, "Informática")
    dHouse.registrarAluno("Luis Felipe", "Maior", 123)
    dHouse.excluirProfessor(2)
    dHouse.excluirProfessor(1)
    dHouse.excluirCurso(33)
    dHouse.excluirCurso(321)
    dHouse.registrarProfessorTitular("Joao Dois", "Dois", 13, "Informática")
    dHouse.registrarProfessorAdjunto("Joao Tres", "Tres", 42, 10)
    dHouse.registrarCurso("Ciência da Computação", 657, 2)
    dHouse.alocarProfessores(657, 13,42 )
    dHouse.alocarProfessores(657, 4434,132)
    dHouse.matricularAluno(123,657)
    dHouse.matricularAluno(13,657)


    println("Nome do aluno: ${aluno1.nome}\nNome do Curso: ${curso.nome}\nData da matrícula: ${matricul.dataMatricula} ")
}