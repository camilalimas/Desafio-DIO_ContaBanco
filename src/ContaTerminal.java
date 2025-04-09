import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        		scanner.nextLine();


        System.out.println ("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Digite o saldo disponível em sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
