public class Cachorro {
    private String raca;
    private String tamanho;
    private String cor;
    private boolean temRabo;

    // Construtor
    public Cachorro(String raca, String tamanho, String cor, boolean temRabo) {
        this.raca = raca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.temRabo = temRabo;
    }

    // Método para enviar mensagem completa sobre as características
    public void late() {
        String mensagem = "Eu sou o \"" + raca + "\" de tamanho \"" + tamanho + "\", minha cor é \"" + cor + "\" e eu ";
        if (temRabo) {
            mensagem += "tenho rabo.";
        } else {
            mensagem += "não tenho rabo.";
        }
        System.out.println(mensagem);
    }

    // Método principal
    public static void main(String[] args) {
        // Criar objetos do tipo Cachorro
        Cachorro cachorro1 = new Cachorro("Fila Brasileiro", "grande", "marrom", true);
        Cachorro cachorro2 = new Cachorro("Pinscher", "pequeno", "preto", false);
        Cachorro cachorro3 = new Cachorro("Husky Siberiano", "médio", "preto", true);

        // Chamar o método late para cada cachorro
        cachorro1.late();
        cachorro2.late();
        cachorro3.late();
    }
}
