public class Aluno extends Pessoa{

    private String matricula;
    private float nota1;
    private float nota2;


    public String getMatricula() {
        return matricula;
    }

    public Aluno setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public float getNota1() {
        return nota1;
    }

    public Aluno setNota1(float nota1) {
        this.nota1 = nota1;
        return this;
    }

    public float getNota2() {
        return nota2;
    }

    public Aluno setNota2(float nota2) {
        this.nota2 = nota2;
        return this;
    }
}
