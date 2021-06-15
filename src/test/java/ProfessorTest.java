import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfessorTest {

        @Test
        void deveRetornarNomeDoProfessor(){
            Professor professor = new Professor();
            professor.setNome("Marco");
            assertEquals("Marco",professor.getNome());
        }

        @Test
        void deveRetornarTitulacaoDoProfessor(){
            Professor professor = new Professor();
            professor.setTitulacaoMax("PHD");
            assertEquals("PHD",professor.getTitulacaoMax());
        }
}