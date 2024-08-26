import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final ao cliente:
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
