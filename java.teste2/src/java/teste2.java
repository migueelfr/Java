
import java.util.Scanner;

public class teste2 {
    public static void main(String[] agrs) {
        menu();
    }
    private static void menu() {
        System.out.println("Exemplo de while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("********** Sistema de Cadastro **********");
            System.out.println("Opção 1: Cadastrar cliente");
            System.out.println("Opção 2: Cadastrar produto");
            System.out.println("Opção 3: Cadastrar vendedor");
            System.out.println("Opção 0: Cadastrar Sair");
            System.out.println("*****************************************");
            System.out.println("Digite a opção:");
            opcao = in.nextInt();
            System.out.println("*****************************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhido.");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhido.");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhido.");
                    exercicio3();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhido.");
                    break;
                default:
                    System.out.println("O número escolhido é inválido!.");
            }
        }while(opcao != 0);
    }

    private static void exercicio3() {
        int num1, num2, num3, num4, soma;
        Scanner in = new Scanner(System.in);

        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();
        System.out.println("digite os numeros" + num1, num2,num3,num4);
        soma = num1 + num2 + num3 + num4;
        System.out.println("soma total dos números" +soma);

    }

    private static void exercicio2() {
        Scanner in = new Scanner(System.in);
    }

    private static void exercicio1() {
    }
}
