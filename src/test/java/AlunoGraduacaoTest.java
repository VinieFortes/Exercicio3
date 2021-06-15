import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoGraduacaoTest {

    @Test
    void deveRetornarNomeDoAluno(){
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNome("Mario");
        assertEquals("Mario",alunoGraduacao.getNome());
    }

    @Test
    void deveRetornarMatriculaDoAluno(){
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setMatricula("376975AC");
        assertEquals("376975AC",alunoGraduacao.getMatricula());
    }

    @Test
    void deveRetoronarAprovacaoDoAlunoGraduacao() {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNota1(7).setNota2(9);
        assertEquals("Aprovado", alunoGraduacao.getResultadoGraduacao());
    }

    @Test
    void deveRetoronarReprovacaoDoAlunoGraduacao() {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNota1(1).setNota2(3);
        assertEquals("Reprovado", alunoGraduacao.getResultadoGraduacao());
    }
}