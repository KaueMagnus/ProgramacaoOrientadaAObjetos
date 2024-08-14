import java.util.Scanner;

public class PrimeiraTDE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eai Dani!");
        System.out.println("Tens duas opções:");
        System.out.println("1- Dar 10 em todas as provas");
        System.out.println("2- Dar nota máxima em todas as provas");
        System.out.print("Qual tu escolhe? ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Fez a boa!");
                break;
            case 2:
                System.out.println("Sempre soube que tu era O cara!");
                break;

            default:
                System.out.println("Opção inválida em!");
                break;
        }

    }
}
