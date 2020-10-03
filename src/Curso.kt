class Curso(var nome: String, var cod: Int, var profT: ProfessorTitular?, var profA: ProfessorAdjunto?, var qtdMaxAlu: Int){


    //nulo
    val matriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno):Boolean{
        if(matriculados.size >= qtdMaxAlu){
            return false
        }else{
            matriculados.add(umAluno)
            return true
        }
    }

    //método precisa ser mais elaborado
    fun excluirAluno(umAluno: Aluno){
        if(matriculados.contains(umAluno)){
            matriculados.remove(umAluno)
            println("Aluno removido com sucesso!")
        }else{
            println("Aluno não encontrado na lista")
        }
    }






}