import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);






        Cliente nara = new Cliente();
        nara.setNome("Nara");

        Conta corrente = new ContaCorrente(nara);
        Conta poupanca = new ContaPoupanca(nara);

        corrente.depositar(-100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}