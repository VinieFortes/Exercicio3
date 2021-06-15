public class AlunoGraduacao extends Aluno{

    public String getResultadoGraduacao() {
        if (((getNota1() + getNota2()) / 2) >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}