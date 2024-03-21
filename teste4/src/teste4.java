import java.util.Scanner;
public class teste4 {

    public static void main(String[] args) {
        menu();
    }
    private static void menu() {

        System.out.println("Exemplo de while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("********** Sistema de exercicio **********");
            System.out.println("exercicio 1: realizar exercicio");
            System.out.println("exercicio 2: realizar exercicio");
            System.out.println("exercicio 3: realizar exercicio");
            opcao = in.nextInt();
            System.out.println("*****************************************");
            switch (opcao){
                case 1:
                    System.out.println("exercicio 1 escolhido.");
                    exercicio4();
                    break;
                case 2:
                    System.out.println("exercicio 2 escolhido.");
                    exercicio5();
                    break;
                case 3:
                    System.out.println("exercicio 3 escolhido.");
                    exercicio6();
                    break;
                default:
                    System.out.println("O número escolhido é inválido!.");
            }
        }while(opcao != 0);
    }
    private static void exercicio4() {
        Scanner in = new Scanner(System.in);
        System.out.println("seu salario atual é: ");
        double salario = in.nextDouble();
        double aumento = salario * 0.05;
        double salariofinal = 0;
        salariofinal += aumento + salario;
        System.out.println("seu aumento é: " + aumento);
        System.out.println("seu salario final é : " + salariofinal );
    }
    private static void exercicio5() {
        Scanner in = new Scanner(System.in);
        System.out.println("digite seu salario: ");
        double salario = in.nextDouble();
        if( salario >0) {
            double gratificacao, imposto, salariototal;
            gratificacao = salario * 0.05;
            imposto = salario * 0.07;
            salariototal = salario + gratificacao - imposto;
            System.out.printf("sua gratificação foi de : %.2f\nseu imposto foi de: %.2f\n seu salario total foi de: %.2f\n ", gratificacao, imposto, salariototal);
        }else{
            System.out.println("Numero Invalido");
        }

    }
    private static void exercicio6() {
        Scanner in = new Scanner(System.in);
        for( int i = 2; i <= 1000; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }


    }
}
