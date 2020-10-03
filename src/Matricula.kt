import java.time.LocalDateTime


class Matricula(var curso: Curso, var aluno: Aluno, var dataMatricula: LocalDateTime = LocalDateTime.now())