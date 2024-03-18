public class Pessoa {
    private String nome;
    private int idade;
    private String cidadeResidencia;

    // Construtor
    public Pessoa(String nome, int idade, String cidadeResidencia) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeResidencia = cidadeResidencia;
    }

    // Método para apresentar informações da pessoa
    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade de Residência: " + cidadeResidencia);
    }

    // Método principal
    public static void main(String[] args) {
        // Criar objetos do tipo Pessoa
        Pessoa pessoa1 = new Pessoa("Miguel", 19, "Belo Horizonte");
        Pessoa pessoa2 = new Pessoa("Carlos", 21, "Britânia");

        // Chamar o método apresentar para cada pessoa
        System.out.println("Dados da Pessoa 1:");
        pessoa1.apresentar();

        System.out.println("\nDados da Pessoa 2:");
        pessoa2.apresentar();
    }
}

