import java.util.Scanner;

public class concatenacao {
    public static void main(String[] args) {


        String nome;
        String idade;
        String profissao;

        Scanner estradaUsuario = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = estradaUsuario.nextLine();

        System.out.println("Qual o sua idade?");
        idade = estradaUsuario.nextLine();

        System.out.println("Qual o sua profissão?");
        profissao = estradaUsuario.nextLine();

        //Estou concatenando
        System.out.println( "Meu nome é "+ nome +" tenho "+ idade + " anos e atualmente sou "+ profissao +"");
    }
}