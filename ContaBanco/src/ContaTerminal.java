import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da agência
        System.out.println("Por favor, digite o número da agência !");
        String agencia = scanner.nextLine();

        // Solicita o número da conta
        System.out.println("Por favor, digite o número da conta !");
        int numero = Integer.parseInt(scanner.nextLine());

        // Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo
        System.out.println("Por favor, digite o saldo !");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Exibe os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}