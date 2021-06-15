import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void deveRetornarNomeDoAluno(){
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNome("Tintim");
        assertEquals("Tintim",alunoEnsinoMedio.getNome());
    }

    @Test
    void deveRetornarMatriculaDoAluno(){
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setMatricula("356975AC");
        assertEquals("356975AC",alunoEnsinoMedio.getMatricula());
    }

    @Test
    void deveRetoronarAprovacaoDoAlunoEnsinoMedio() {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNota1(8).setNota2(9);
        assertEquals("Aprovado", alunoEnsinoMedio.getResultadoEnsinoMedio());
    }

    @Test
    void deveRetoronarReprovacaoDoAlunoEnsinoMedio() {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNota1(2).setNota2(3);
        assertEquals("Reprovado", alunoEnsinoMedio.getResultadoEnsinoMedio());
    }
}