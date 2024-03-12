public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        f1.salario = 1000;
        f2.salario = 2000;
        f3.salario = 3000;

        f1.nome = "andre";
        f2.nome = "carol";
        f3.nome = "miguel";

        f1.setidade(10);
        f2.setidade(20);
        f3.setidade(22);


        System.out.printf("salario de é(%s): %f com idade de %d", f1.nome, f1.salario, f1.getidade());
        System.out.printf("\nsalario de 2 é(%s): %f com idade de %d", f2.nome, f2.salario,f2.getidade());
        System.out.printf("\nsalario de é(%s): %f com idade de %d ", f3.nome, f3.salario, f3.getidade());

    }
}
