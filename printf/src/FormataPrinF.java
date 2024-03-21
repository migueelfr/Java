public class FormataPrinF {
    public static void main(String[] args){
        String minha_string = "Programação Orientada a Objetos";
        int meu_inteiro =234;
        float meu_numero = 865.44f;

        System.out.print(minha_string + " - " + meu_inteiro + " - " + meu_numero);
        System.out.printf("\n%s - %d - %.2f", minha_string, meu_inteiro, meu_numero);
    }
}
