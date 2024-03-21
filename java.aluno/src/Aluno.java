public class Aluno {
    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    disciplina disciplina_pref;
    public Aluno(String nome, int matricula, double nota_mat, double nota_por, double nota_fis, double nota_geo, double nota_quim, disciplina disciplina){
        this.nome = nome;
        this.nota_mat = nota_mat;
        this.nota_por = nota_por;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_quim = nota_quim;
        this.disciplina_pref = disciplina;

    }
    double CalcularMedia() {
        return ( nota_mat + nota_por + nota_fis + nota_geo + nota_quim ) / 5;
    }
    String SituacaoAluno() {
        String situacao = "Reprovado"; // aprovado ou reprovado

        if ( CalcularMedia() >= 6 )
            situacao = "Aprovado";

        return situacao;
    }

}