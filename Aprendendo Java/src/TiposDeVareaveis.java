//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TiposDeVareaveis {
    public static void main(String[] args) {

        /*
        byte: -128 a 127 (1 byte ou 8 bit)
        short: -32768 a 32767 (2 byte ou 16 bit)
        int: -2147483648 a 2147483647 (2 bilhões) (4 bytes ou 32 bit)
        long: −9223372036854775808 a 9223372036854775807 (8 bytes ou 64 bit)

        Numeros decimeais

        float: 7 casas decimais - 1234567 (4 bytes ou 32 bit)
        double: 15 casas ddecimais- 123456789123456 (8 bytes ou 64 bit)

        String: vai receber textos == palavras e frases
        char: Suporte apenas um caracter

         */

        //Primitivos
        byte idade = 120;
        short estoque = 32767;
        int numero = 2147483647;
        long  valores = 9223372036854775807L;
        float real = 10.50f;
        char minhaLetra = 'V';
        boolean botaAtivado = true;
        boolean botaoDesativado = false;
        String nome = "Victor Henrique";

        //Classes Wrappers(contem mais funciões que o primitivo)
        Byte idade1 = 120;
        Short estoque1 = 32767;
        Integer numero1 = 2147483647;
        Long  valores1 = 9223372036854775807L;
        Float real1 = 10.50f;
        Character minhaLetra1 = 'V';
        Boolean botaAtivado1 = true;
        Boolean botaoDesativado1 = false;


        /*Vareavel de um jeito mais facil*/
        var sobrenome = "Victor 55";

        /*Fuynçõas mostrar*/
        System.out.println(idade);
        System.out.println(estoque);
        System.out.println(numero);
        System.out.println(valores);

        System.out.println(sobrenome);


    }

}