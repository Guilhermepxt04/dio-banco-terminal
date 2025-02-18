import java.util.Scanner;
import java.util.Locale;

/**
 * <h1>ContaTerminal</h1>
 * A Conta no terminal realiza a simulação de uma abertura de conta
 * <p>
 *
 *@author = Guilherme peixoto
 *@version = 1.0
 *@since = 18/02/2025
*/

public class ContaTerminal {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite a Agência !");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo na conta !");
        double saldo = sc.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque. ",
                nomeCliente, agencia, numero, saldo);

        sc.close();
    }

}
