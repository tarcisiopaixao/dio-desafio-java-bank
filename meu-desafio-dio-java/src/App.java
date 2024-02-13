import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Banco cliente = new Banco();
        Scanner terminal = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Banco TPS\nPara criar sua conta no Banco TPS");

        System.out.println("Digite numero de incrição com 6 digitos:");
        int numeroInscricao = terminal.nextInt();
        System.out.println("");

        System.out.println("Agora digite sua agência (xxxx-x):");
        String agencia = terminal.next();
        System.out.println("");

        System.out.println("Agora digite seu Nome completo:");
        terminal.nextLine();
        String nomeCliente = terminal.nextLine();
        System.out.println("");

        System.out.println("Qual Valor deseja depositar inicialmente?");
        Double saldo = terminal.nextDouble();
        System.out.println("");

        cliente.setAgencia(agencia);
        cliente.setNome(nomeCliente);
        cliente.setNumero(numeroInscricao);
        cliente.setSaldo(saldo);

        System.out.println("Resumo do cadastro \n");

        System.out.printf("Numero de inscrição: %d \n", cliente.getNumero());
        System.out.printf("Agencia:%s \n", cliente.getAgencia());
        System.out.printf("Nome do cliente: %s\n", cliente.getNome());
        System.out.printf("Saldo em conta: %2f\n", cliente.getSaldo());
        System.out.println("");

        System.out.printf(
                "Olá Cliente %s, obrigado por criar uma conta em nosso Banco TPS, sua agência é %s, conta %d, e seu saldo de: %2f está disponivel para saque!",
                nomeCliente, agencia, numeroInscricao, saldo);
        terminal.close();

    }
}
