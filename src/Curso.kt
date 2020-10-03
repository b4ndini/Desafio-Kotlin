class Curso(var nome: String, var cod: Int, var profT: ProfessorTitular?, var profA: ProfessorAdjunto?, var qtdMaxAlu: Int){



    val matriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno):Boolean{
        if(matriculados.size >= qtdMaxAlu){
            return false
        }else{
            matriculados.add(umAluno)
            return true
        }
    }


    fun excluirAluno(umAluno: Aluno){
        if(matriculados.contains(umAluno)){
            matriculados.remove(umAluno)
            println("Aluno removido com sucesso!")
        }else{
            println("Aluno não encontrado na lista")
        }
    }






}