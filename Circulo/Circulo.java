public class Circulo {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Método para calcular o perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Exemplo de uso da classe Circulo
        Circulo meuCirculo = new Circulo(7.0);

        // Calcular e exibir a área e o perímetro do círculo
        System.out.println("Raio do círculo: " + meuCirculo.raio);
        System.out.println("Área do círculo: " + meuCirculo.calcularArea());
        System.out.println("Perímetro do círculo: " + meuCirculo.calcularPerimetro());
    }
}