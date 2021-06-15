public class AlunoEnsinoMedio extends Aluno{

    public String getResultadoEnsinoMedio() {

        if (((getNota1() + getNota2()) / 2) >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}
