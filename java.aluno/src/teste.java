public class teste{
    public static void main (String [] args){
        disciplina d1 = new disciplina("matemática", 60);
        Aluno a1 = new Aluno("Miguel", 1234, 5, 6, 10, 9, 7,d1);
        a1.CalcularMedia();



        System.out.println("Situação do Aluno: " + a1.nome + " = " + a1.SituacaoAluno() + " com média " + a1.CalcularMedia());
        System.out.println("\nDisciplina Preferida: " + a1.disciplina_pref.nome);

    }
}