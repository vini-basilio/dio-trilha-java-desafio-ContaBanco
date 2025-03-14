import edu.dio.contabancaria.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        var conta = new Conta();

        conta.iniciarScanner();

        conta.inicializarAgencia();
        conta.inicializarConta();
        conta.inicializarCliente();
        conta.inicializarSaldo();

        conta.fecharScanner();

        conta.imprimeMensagem();
    }
}
