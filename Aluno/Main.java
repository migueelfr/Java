public class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Miguel",19,"213213");
        System.out.println("Informações do aluno");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());
    }
}