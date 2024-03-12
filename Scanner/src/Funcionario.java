public class Funcionario {
    public String nome;
    public double salario;
    private int idade;

    public void AumentoSalario(double aumento) {
        this.salario += aumento;

    }

    public void aumentaidade() {
        this.idade += 1;
    }

    public  void setidade(int valor) {
        this.idade = valor;
    }

    public int getidade() {
        return this.idade;
    }
}
