import java.util.Scanner;
public class Cigarro {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("A quantos anos voce fuma: ");
        int anos = i.nextInt();
        System.out.println("Quantos cigarros por dia voce consome? :");
        int dia = i.nextInt();
        System.out.println("Qual o preço médio de um maço?: ");
        double preco = i.nextDouble();
        double cigarrosDiarios, totalCigarrosMaco, totalCigarrosVida, totalMacosComprados;
        cigarrosDiarios = dia * 365;
        totalCigarrosVida = anos * cigarrosDiarios;
        totalCigarrosMaco = preco * totalCigarrosVida / 20;
        totalMacosComprados = totalCigarrosVida / 20;
        System.out.println("Voce fumou " + totalCigarrosVida + " em toda sua vida");
        System.out.println("Voce gastou " + totalCigarrosMaco + " com cigarros no total");
        System.out.println("Voce comprou " + totalMacosComprados + " maços de cigarro no total");


    }
}

