package sistemaNotas

abstract class InformacaoGeral(val name: String, val n1: Double, val n2: Double, val n3: Double) {

    private lateinit var teacher: Teacher

    protected fun informacaoProfessor(nameTec: String, disp: String): String {
        this.teacher = Teacher(nameTec, disp)
        return "O professor ${teacher.name} na displina ${teacher.displina},"
    }

    //Calcula mostra a media do Aluno
    abstract fun mostraMediaAluno(nameTeacher: String, displina: String)
    abstract fun mostraMediaAluno()
}

//Dados do Estudante e Professores (Data Class):
private data class Teacher(var name: String, var displina: String)
private data class Student(var matricula: Int, var nm: String, var mediaNote: Double)

data class SistemasNotas(
    private val numMatric: Int,
    protected val nm: String,
    protected val note1: Double,
    protected val note2: Double,
    protected val note3: Double
) :
    InformacaoGeral(nm, note1, note2, note3) {

    companion object {
        private var listaNotas = mutableListOf<Double>()
        private var nomesAlunos = mutableListOf<String>()
        private var maiorNota = 0.0

        //Verifica A maior nota dos Estudante
        private fun verficNota(nota: Double) {
            if (maiorNota < nota) this.maiorNota = nota
        }

        fun mediaMaior() {
            for (l in listaNotas.indices) {
                if (listaNotas[l] >= maiorNota) {
                    println(
                        "O aluno ${nomesAlunos[l]} teve maior nota da turma: Media = ${
                            String.format(
                                "%.1f",
                                listaNotas[l]
                            )
                        }"
                    )
                }
            }
        }
    }

    init {
        nomesAlunos.add(name)
        mostraMediaAluno()
    }

    private lateinit var student: Student

    override fun mostraMediaAluno(nameTeacher: String, displina: String) {
        val calc = (n1 + n2 + n3) / 3.0
        val professor = informacaoProfessor(nameTeacher, displina)
        this.student = Student(numMatric, name, calc) //student declaração lateinit
        println(professor + "\n" + exibirNotaAluno())
    }

    override fun mostraMediaAluno() {
        val calc = (n1 + n2 + n3) / 3.0
        this.student = Student(numMatric, name, calc) //student declaração lateinit
        verficNota(calc)
        listaNotas.add(calc)
    }

    fun exibirConsoleNota() {
        val message = exibirNotaAluno()
        println(message)
    }

    fun getNota(): Double = student.mediaNote

    private fun exibirNotaAluno(): String =
        "O aluno ${student.nm} com a matricula ${student.matricula} teve uma nota = " +
                String.format("%.1f", student.mediaNote)



}

