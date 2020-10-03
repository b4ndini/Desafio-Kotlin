class DigitalHouseManager {

    var listaDeAlunos = mutableListOf<Aluno>()
    var listaDeCursos = mutableListOf<Curso>()
    var listaDeProfessores = mutableListOf<Professor>()
    var listaDeMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaximaDeAlunos: Int){
        val curso = Curso(nome, codigoCurso, null, null, qtdMaximaDeAlunos)
        listaDeCursos.add(curso)
        println("Curso adicionado com sucesso")
    }

    fun excluirCurso(codCurso: Int) {
        for (i in 0 until listaDeCursos.size) {
            if (listaDeCursos[i].cod == codCurso) {
                listaDeCursos.removeAt(i)
                println("Curso removido com sucesso")
                break
            } else {
                println("Curso não encontrado")
            }

        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        var profA = ProfessorAdjunto(nome, sobrenome, codigoProfessor,0, quantidadeDeHoras)
        listaDeProfessores.add(profA)
        println("Professor adjunto adicionado com sucesso")

    }


    fun registrarProfessorTitular(nome: String, sobrenome: String , codigoProfessor: Int, especialidade: String ){
        var profT = ProfessorTitular(nome, sobrenome, codigoProfessor,0, especialidade)
        listaDeProfessores.add(profT)
        println("Professor titular adicionado com sucesso")
    }



    fun excluirProfessor(codigoProfessor: Int){
        for (i in 0 until listaDeProfessores.size){
            if (listaDeProfessores[i].cod == codigoProfessor) {
                listaDeProfessores.removeAt(i)
                println("Professor removido com sucesso")
                break
            }else {
                println("Professor não encontrado")
            }

            }
        }


    fun registrarAluno(nome: String , sobrenome: String , codigoAluno: Int){
        var aluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(aluno)
        println("Aluno ${aluno.nome} adicionado com sucesso!")
    }



    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var curso: Curso = Curso("a", -1, null, null, -1)
        var aluno: Aluno = Aluno("a", "b", -1)


        for(x in 0 until listaDeCursos.size) {
            if (listaDeCursos[x].cod == codigoCurso) {
                curso = listaDeCursos[x]
                break
            }
        }
        for(x in 0 until listaDeAlunos.size) {
            if (listaDeAlunos[x].cod == codigoAluno) {
                aluno = listaDeAlunos[x]
                break
            }
        }

            if(curso.cod != -1 && aluno.cod != -1) {
                if (curso.adicionarUmAluno(aluno)) {
                    val matricula: Matricula = Matricula(curso, aluno)
                    listaDeMatriculas.add(matricula)
                    println("Aluno ${aluno.nome} matriculado com sucesso no curso ${curso.nome}")
                } else {
                    println("Não foi possível matricular, pois não há vagas no curso")
                }
            }else{println("Não foi possível cadastrar o aluno")}

            }


    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){

        var controle : Int = 0
        var profT : ProfessorTitular? = null
        var profA : ProfessorAdjunto? = null
        var curso : Curso? = null

        for(x in 0 until listaDeProfessores.size){
            if(listaDeProfessores[x].cod == codigoProfessorTitular && listaDeProfessores[x] is ProfessorTitular){
                profT = listaDeProfessores[x] as ProfessorTitular
                controle++
            }
        }

        for(x in 0 until listaDeProfessores.size){
            if(listaDeProfessores[x].cod == codigoProfessorAdjunto && listaDeProfessores[x] is ProfessorAdjunto){
                profA = listaDeProfessores[x] as ProfessorAdjunto
                controle++
            }
        }

        for(x in 0 until listaDeCursos.size){
            if(listaDeCursos[x].cod == codigoCurso){
                curso = listaDeCursos[x]
                controle++
            }
        }

        if(curso != null && profT != null){
            curso.profT = profT;
            println("Professor Titular foi cadastrado no curso ${curso.nome} com sucesso!")
        }

        if(curso != null && profA != null){
            curso.profA = profA;
            println("Professor Adjunto foi cadastrado no curso ${curso.nome} com sucesso!")
        }

        if(controle <= 1){println("Não foi possível alocar os professores ao cursos")}


    }




}








