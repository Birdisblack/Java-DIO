//@autor:Wesley Gomes dos Santos
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
// Scanner do numero
        System.out.println("Digite o numero.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero = scanner.nextInt();

// Scanner da Agencia

System.out.println("Digite a Agencia.");
     scanner = new Scanner(System.in);
    String agencia = scanner.nextLine();

// Scanner nome do cliente

    System.out.println("Digite o nome");
     scanner = new Scanner(System.in);
    String nomeCliente = scanner.nextLine();

// Scanner do saldo

    System.out.println("Digite o saldo");
     scanner = new Scanner(System.in);
    Double saldo = scanner.nextDouble();

// Exibir na tela.


    System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já esta disponivel para saque");

    }
}
