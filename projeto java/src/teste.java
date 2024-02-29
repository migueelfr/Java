import java.io.IOException;
public class teste {
    public static void main(String[] agrs) throws IOException {
        System.out.println("Olá, mundo");
        char ch;
        ch = 'x';
        System.out.println("ch contains" + ch);
        ch++; //incrementa ch
        System.out.println("ch is now" + ch);
        ch = 98; // dá a ch o valor Z
        System.out.println("ch is now" + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 922337236854775887l;
        boolean tipoBoolean = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBoolean = " + tipoBoolean);

        //Demonstra sequencias de escape em strings
        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        //Demonstra valores booleans
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        //um valor booleano pode controlar a instrução if
        if(b) System.out.println(" This is executed.");
        b = false;
        if(b) System.out.println(" This is not executed");
        // o resultado de um operador relacional é um valor boleano
        System.out.println("18 > 9 is " + (18 > 9));

        int count = 18; //da a count um valor inicial igual a 18
        char chr = 'x'; // inicializa chr com a letra x
        float f = 1.2F; // f é inicializada com 1,2

        // demonstra o espoco do bloco
        int m; //conhecido pelo codigo de main()
        m = 18;
        if(m == 18) { //inicializa novo escopo
            int n = 20; //conhecida apenas nesse bloco
            // tanto m quanto n sao conhecidas aqui
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;

        }

        //n = 100; // erro! n nao é conhecida aqui
        // m ainda é conhecida aqui
        System.out.println("m is " + m);

        // demonstra o tempo de vida de uma variavel
        for(int i = 0; i < 3; i++) {
            int j = -1; // y será inicializado semprer que entrarmos no block
            System.out.println("j is: " + j); // essa linha exibe -1
            j = 100;
            System.out.println("j is now: " +j);
        }

        // demonstra os operadores relacionais e logicos
        int i, j; boolean b1, b2;
        i = 18;
        j = 11;
        if(i < j) System.out.println("\ni <j");
        if(i <=j) System.out.println("i <=j");
        if(i !=j) System.out.println("i !=j");
        if(i ==j) System.out.println("This won't execute");
        if(i >=j) System.out.println("This won't execute");
        if(i >j) System.out.println("This won't execute");

        b1 = true;
        b2 = false;






    }

}
