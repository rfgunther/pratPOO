import java.util.Scanner;

public class AppSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        int anoAtual = sc.nextInt();
        int anoNasc = sc.nextInt();

        int idade = anoAtual - anoNasc;
        System.out.println(nome + " tem " + idade + " anos.");
    }
}


